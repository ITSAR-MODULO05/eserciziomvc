 $(document).ready(function() {
   $("#postStudente").click(function() {
   $.post("/add", { id : 1, nome : "Prova", cognome="Prova"},
   function(data) {
     alert("Data Loaded: " + data);
   });
   });
 });