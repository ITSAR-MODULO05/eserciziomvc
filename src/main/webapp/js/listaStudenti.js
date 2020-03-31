 $(document).on("click", "#button", function() {        
            $.get("listStudentiJson", function(responseJson) {          // Esegue una richiesta GET Ajax alla "listStudentiJson" e ottiene il JSON di risposta
                var $table = $("<table border=\"1\">").appendTo($("#listaStudentiDiv")); // Crea una tabella e la appende all'elemento con  ID "listaStudentiDiv".
                $.each(responseJson, function(index, studente) {    // Itera sull'array JSON.
                    $("<tr>").appendTo($table)                     
                        .append($("<td>").text(studente.id))       
                        .append($("<td>").text(studente.nome))        
                        .append($("<td>").text(studente.cognome));    
                });
            });
            $("#button").attr("disabled", true);
        });