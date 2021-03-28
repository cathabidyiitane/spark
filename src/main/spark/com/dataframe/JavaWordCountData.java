package com.dataframe;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import org.apache.spark.api.java.function.VoidFunction;
import scala.Tuple2;

import java.util.Arrays;

/**
 * @author gouyangyang on 2018/11/24/024 23:18
 */
public class JavaWordCountData {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("WordCount").setMaster("local[2]");
        JavaSparkContext jsc = new JavaSparkContext(conf);
        JavaRDD<String> lines = jsc.textFile("D:\\github_project\\sparkorscala\\data\\data.txt");
        JavaRDD<String> word = lines.flatMap(new FlatMapFunction<String, String>() {

            public Iterable<String> call(String str) throws Exception {
                return Arrays.asList(str.split(" "));  // 数组转换成list
            }
        });
        JavaPairRDD<String, Integer> word2int = word.mapToPair(new PairFunction<String, String, Integer>() {
            private static final long serialVersionUID = 1L;

            public Tuple2<String, Integer> call(String word) throws Exception {
                return new Tuple2<String, Integer>(word, 1);
            }
        });
        JavaPairRDD<String, Integer> res = word2int.reduceByKey(new Function2<Integer, Integer, Integer>() {
            private static final long serialVersionUID = 1L;

            public Integer call(Integer a, Integer b) throws Exception {
                return a + b;
            }
        });
        res.foreach(new VoidFunction<Tuple2<String, Integer>>() {
            private static final long serialVersionUID = 1L;

            public void call(Tuple2<String, Integer> t) throws Exception {
                System.out.println(t._1 + " : " + t._2);
            }
        });
    }


}
