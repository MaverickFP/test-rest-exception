# test-rest-exception
Test sull'uso delle eccezioni in un web service rest

<h3>Info</h3>
<p>E' stata una classe <b>Persona</b> che rappresenta una entita.</p>
<p><b>SingletonEjb</b> e' uno stateless session bean che viene caricato allo
startup dell'applicazione. Viene creato e popolato un ArrayList di Persone. Tale EJB 
ha due metodi. In <b>trovaPersona</b> si cerca di trovare una persona mediante il suo id.
Se non ci si riesce, viene restituito null. In <b>trovaPersonaIndiceArray</b> si cerca di
 recuperare una persona mediante l'indice della posizione dell'array. Se si inserisce un
  indice errato verra' sollevata l'eccezione <b>java.lang.IndexOutOfBoundsException</b>.</p>
