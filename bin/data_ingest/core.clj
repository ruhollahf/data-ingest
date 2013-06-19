

(use 'incanter.core
     'clojure.java.jdbc)



(def db {:classname "com.microsoft.jdbc.sqlserver.SQLServerDriver"
               :subprotocol "sqlserver"
               :subname "//172.29.75.47:1433;database=ODS;user=OSDUser;password=ReadOnly"
})

;Below code demos how to execute a simple sql select query and print it to console
;This query will print all the user tables in your MS SQL Server Database
(with-connection db 
      (with-query-results rs ["select * from sys.objects  where type = 'U'"] 
           (doseq [row rs] (println (:name row)))
))



comment(
(defn load-table-data
  "This loads the data from a database table."
  [db table-name]
  (let [sql (str "SELECT * FROM "
                 table-name ";")]
    (with-connection db
      (with-query-results rs [sql]
        (to-dataset (doall rs))))))

(def db {:subprotocol "sqlite"
         :subname "data/small-sample.sqlite"
         :classname "org.sqlite.JDBC"})
)