(defproject app "migrate-h2-lein"

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [migratus "0.8.8"]
                 ; [org.slf4j/slf4j-log4j12 "1.7.9"] ;; see migratus readme
                 [com.h2database/h2 "1.4.188"]]

  ; :main app.core - not needed; the app is not started.

  :plugins [[migratus-lein "0.2.0"]]

  :migratus {	:store :database
			  	:migration-dir "migrations"
			  	:db "jdbc:h2:./db/my_h2"}
  )
