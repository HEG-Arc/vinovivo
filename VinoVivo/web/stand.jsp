<%-- 
    Document   : newjsp
    Created on : 27 avr. 2014, 22:54:53
    Author     : Morvan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>VinoVivo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link type="text/css" rel="stylesheet" href="styles/jquery.mobile.min.css" />
        <link type="text/css" rel="stylesheet" href="plugins/jquery/jRating.jquery.css">
        <link type="text/css" rel="stylesheet" href="plugins/raty/demo/css/application.css">

        <script src="scripts/jquery.min.js"></script>
        <script src="scripts/jquery.mobile.min.js"></script>
        <script src="plugins/jquery/jRating.jquery.js"></script>
        <script src="plugins/raty/lib/jquery.raty.js"></script>
    </head>
    <body>
        <div data-role="page" id="pageStand">
            <div data-role="header">
                <h1>Vino Vivo</h1>
                <div data-role="navbar">
                    <ul>
                        <li><a href="#" class="ui-btn-active ui-state-persist" rel="external">Stands</a></li>
                        <li><a href="vins.jsp" data-transition="none" rel="external">Vins</a></li>
                        <li><a href="vinsDegust.jsp" data-transition="none" rel="external">Commandes</a></li>
                    </ul>
                </div>
            </div>
            <div data-role="main" class="ui-content">
                <div data-role="collapsibleset" data-mini="true">
                    <div data-role="collapsible">
                        <h2>Stand 1<br><span style="font-size:10px">Vins blancs Suisse</span></h2>
                        <p>Vins blancs Suisse</p>
                        <a href="vins.jsp"  rel="external" data-transition="none" data-prefetch="true">Accéder aux vins</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>Stand 2<br><span style="font-size:10px">Vins blancs Europe/Outre-mer</span></h2>
                        <p>Vins blancs Europe/Outre-mer</p>
                        <a href="vins.jsp" rel="external" data-transition="none">Accéder aux vins</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>Stand 3<br><span style="font-size:10px">Vins rouges Suisse</span></h2>
                        <p>Vins rouges Suisse</p>
                        <a href="vins.jsp" rel="external" data-transition="none">Accéder aux vins</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>Stand 4<br><span style="font-size:10px">Vins rouges France (Bourgogne/sud-ouest de la France)</span></h2>
                        <p>Vins rouges France (Bourgogne/sud-ouest de la France)</p>
                        <a href="vins.jsp" rel="external" data-transition="none">Accéder aux vins</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>Stand 5<br><span style="font-size:10px">Vins rouges France (vallée du Rhône/sud de la France</span></h2>
                        <p>Vins rouges France (vallée du Rhône/sud de la France</p>
                        <a href="vins.html" rel="external" data-transition="none">Accéder aux vins</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>Stand 6<br><span style="font-size:10px">Domaine Barons de Rothschild [Lafite]</span></h2>
                        <p>Domaine Barons de Rothschild [Lafite]</p>
                        <a href="vins.html" rel="external" data-transition="none">Accéder aux vins</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>Stand 7<br><span style="font-size:10px">Vins rouges Espagne (Navarra/Rioja/Ribera del Duero</span></h2>
                        <p>Vins rouges Espagne (Navarra/Rioja/Ribera del Duero</p>
                        <a href="vins.html" rel="external" data-transition="none">Accéder aux vins</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>Stand 8<br><span style="font-size:10px">Vins Rouges Espagne</span></h2>
                        <p>Vins Rouges Espagne</p>
                        <a href="vins.html" rel="external" data-transition="none">Accéder aux vins</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>Stand 9<br><span style="font-size:10px">Boutique</span></h2>
                        <p>Boutique</p>
                        <a href="vins.html" rel="external" data-transition="none">Accéder aux vins</a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
