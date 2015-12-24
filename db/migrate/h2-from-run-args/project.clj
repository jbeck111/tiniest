(defproject app "migrate-h2-lein"

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [migratus "0.8.8"]
                 [com.h2database/h2 "1.4.188"]]

  :main app.core
)
