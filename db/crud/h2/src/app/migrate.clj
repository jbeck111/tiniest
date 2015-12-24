(ns app.migrate
	(:require [migratus.core :as migratus]))

(def config {	:store :database
			  	:migration-dir "migrations"
			  	:db "jdbc:h2:./db/my_h2"})

(defn make-db
	[]
	(migratus/migrate config)
	(println "db is up")
	)
