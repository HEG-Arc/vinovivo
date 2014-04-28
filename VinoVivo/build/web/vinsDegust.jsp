<%-- 
    Document   : vinsDegust
    Created on : 28 avr. 2014, 09:47:52
    Author     : Morvan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>VinoVivo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" href="styles/jquery.mobile.min.css" />
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="plugins/jquery/jRating.jquery.css">
        <link type="text/css" rel="stylesheet" href="plugins/raty/demo/css/application.css">

        <script src="scripts/jquery.min.js"></script>
        <script src="scripts/jquery.mobile.min.js"></script>
        <script src="plugins/jquery/jRating.jquery.js"></script>
        <script src="plugins/raty/lib/jquery.raty.js"></script>
    </head>
    <body>
        <div data-role="page" id="pageCommande">
            <div data-role="header">
                <h1>Vino Vivo</h1>
                <div data-role="navbar">
                    <ul>
                        <li><a href="stand.jsp" data-transition="none" >Stands</a></li>
                        <li><a href="vins.jsp" >Vins</a></li>
                        <li><a href="#" class="ui-btn-active ui-state-persist" data-transition="none" rel="external">Commandes</a></li>
                    </ul>
                </div>
            </div>

            <div data-role="main" class="ui-content">
                <a href="index.html" data-transition="none" class="ui-btn ui-btn-inline">Accueil</a><br>
                <p style="font-size: 15px">Liste des vins souhaités</p>
                <ol data-role="listview">
                    <li>Calamin Lavaux AOC La Béguine J. et M. Dizerens</li>
                    <li>St-Saphorin Lavaux AOC J. et M. Dizerens</li>
                    <li>Aigle Chablais AOC Merveille des Roches</li>
                    <li>Genève AOC Sauvignon Gris Le Savant</li>
                    <li>Necuhâtel AOC Hôpital Pourtalès</li>
                </ol><br>
                <a href="#" data-transition="none" class="ui-btn ui-btn-inline" data-rel="back">Retour</a>
            </div>
        </div> 
    </body>
</html>
