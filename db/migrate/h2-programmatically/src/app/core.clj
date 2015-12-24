(ns app.core
	(:require [migratus.core :as migratus]))

(def config {	:store :database
			  	:migration-dir "migrations"
			  	:db "jdbc:h2:./db/my_h2"})

(defn -main
	[]
	(migratus/migrate config)
	(println "Done.")
	)


; Other instructions you could use in place of "migrate"
; ------------------------------------------------------

; rollback the last migration applied
; (migratus/rollback config)

; do particular migration matching this id
; (migratus/up config 20111206154000)

; undo migration matching the id
; (migratus/down config 20111206154000)