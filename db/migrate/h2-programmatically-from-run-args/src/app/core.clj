(ns app.core
	(:require [migratus.core :as migratus]))

(defn nothing
	[]
	(println "No recognised args were given, so nothing happened. Try \"lein run migrate\" or \"lein run rollback\""))

(def config {	:store :database
			  	:migration-dir "migrations"
			  	:db "jdbc:h2:./db/my_h2"})

(defn mig [args]
	(case (first args)
		"migrate"
			(migratus/migrate config)
		"rollback"
			(migratus/rollback config)))

(defn -main
	[& args]
	(cond
	(some #{"migrate" "rollback"} args)
	(do (mig args) (System/exit 0))
	:else
	(nothing)))

; Taking it further: take another run arg; use it for specifying a id...
; ----------------------------------------------------------------------

; do particular migration matching this id
; (migratus/up config 20111206154000)

; undo migration matching the id
; (migratus/down config 20111206154000)