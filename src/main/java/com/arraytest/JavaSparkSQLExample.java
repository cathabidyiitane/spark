package com.arraytest;

import org.apache.hadoop.hive.ql.exec.spark.session.SparkSession;
import org.apache.spark.sql.AnalysisException;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

import java.io.Serializable;

// $example on:programmatic_schema$
// $example off:programmatic_schema$
// $example on:create_ds$
// $example off:create_ds$
// $example on:schema_inferring$
// $example on:programmatic_schema$
// $example off:programmatic_schema$
// $example on:create_ds$
// $example on:create_df$
// $example on:run_sql$
// $example on:programmatic_schema$
// $example off:programmatic_schema$
// $example off:create_df$
// $example off:run_sql$
// $example off:create_ds$
// $example off:schema_inferring$
// $example on:init_session$
// $example off:init_session$
// $example on:programmatic_schema$
// $example off:programmatic_schema$
// $example on:untyped_ops$
// col("...") is preferable to df.col("...")

/**
 * https://github.com/apache/spark/blob/master/examples/src/main/java/org/apache/
 * spark/examples/sql/JavaSparkSQLExample.java
 *
 * @ Created by gouyy on 2018-01-04.
 */
public class JavaSparkSQLExample {
    public static class Person implements Serializable {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) throws AnalysisException {

//        SparkSession spark = SparkSession
//                .builder()
//                .appName("Java Spark SQL basic example")
//                .config("spark.some.config.option", "some-value")
//                .getOrCreate();
        // $example off:init_session$

//        runBasicDataFrameExample(spark);
//        runDatasetCreationExample(spark);
//        runInferSchemaExample(spark);
//        runProgrammaticSchemaExample(spark);

//        spark.stop();

    }

//    private static void runBasicDataFrameExample(SparkSession spark) throws Exception {
//
//        Dataset<Row> df = spark.read().json("examples/src/main/resources/people.json");
//    }
}
