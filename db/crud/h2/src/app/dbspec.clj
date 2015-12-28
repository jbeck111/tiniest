(ns app.dbspec)

(let [db-host     "./db" ; "path|host:port"
		db-name     "my_h2"]

	(def subname (str db-host "/" db-name))

	(def db-spec
		{	:classname		"org.h2.Driver"
		 	:subprotocol	"h2:file" ; |h2:mem|h2:tcp
		 	:subname 		subname
			:make-pool?     true
			:naming	{	:keys   clojure.string/lower-case
							:fields clojure.string/upper-case}
		 }))


; Optional; other things that could go in db-spec
;
;  Used in Luminus)...
;	:make-pool?     true
;	:naming	{	:keys   clojure.string/lower-case
;					:fields clojure.string/upper-case}
;
;	Shown in https://en.wikibooks.org/wiki/Clojure_Programming/Examples/JDBC_Examples#H2Database
;	:user     "sa"
;	:password ""

; http://makble.com/using-h2-in-memory-database-in-clojure