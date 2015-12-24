(defproject app "crud-h2"

  :dependencies [[org.clojure/clojure "1.7.0"]
  				 [org.clojure/java.jdbc "0.4.2"]
                 [com.h2database/h2 "1.4.188"]
                  ; below needed only to set up the db for demonstration
                 [migratus "0.8.8"]
                ]

  :main app.core

)
