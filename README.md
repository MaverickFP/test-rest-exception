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

<p><b>RestPersona</b> e' l'endpoint che permette di effettuare le chiamate Rest. 
In <b>getPersona</b> se viene restituito un valore nullo, dalla chiamata del servizio offerto
 dall'EJB, viene sollevata l'eccezione <b>MyException</b>. A tale eccezione viene passato 
 un semplice Json dove e' specificato un codice ed una descrizione dell'errore.<br>
 In <b>getPersona2</b> si cerca di recuperare una persona specificando l'indice dell'array.
 </p>


<p><b>MyException</b> estende <b>WebApplicationException</b> ed ha il compito di creare 
una risposta da mostrare a chi ha effettuato la chiamata Rest mediante la costruzione di
un oggetto <b>Response</b>. Questa modalita' e' il meccanismo piu' semplice per
indicare al client il verificarsi di una situazione anomala.</p>


<p><b><OutArrayRange</b> rappresenta un modo alternativo per comunicare all'utente che si e'
 verificato un evento anomalo. Se viene specificato, nella chiamata Rest, un indice dell'array che
 che non contiene nessun elemento, viene sollevata una eccezione di tipo <b>java.lang.IndexOutOfBoundsException</b>. 
 <b><OutArrayRange</b> viene lanciata direttamente ogni volta che si verifica <b>java.lang.IndexOutOfBoundsException</b>.
 In questo modo e' possibile specificare l'oggetto Response da inviare al client e nel codice non e' necessario 
 indicare blocchi try...catch. L'uso di tale pattern permette di avere pertanto un codice piu' pulito.
 <b>DRY</b> (Don't Repeat Yourself)</p>