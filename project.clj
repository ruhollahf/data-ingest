(defproject data-ingest "0.1.0-SNAPSHOT"
  :description "Project connecting to database and loading data into hadoop"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"local" ~(str (.toURI (java.io.File. "maven_repository")))}
 
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [incanter/incanter-core "1.5.1"]
                 [org.clojure/java.jdbc "0.2.3"]
                 ;[sqljdbc4/sqljdbc4 "4.0"]
                 ])
