<%-- 
    Document   : vins
    Created on : 28 avr. 2014, 09:40:12
    Author     : Morvan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>VinoVivo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="styles/jquery.mobile.min.css" />
        <link rel="stylesheet" href="plugins/jquery/jRating.jquery.css">
        <link type="text/css" rel="stylesheet" href="plugins/raty/demo/css/application.css">

        <script src="scripts/jquery.min.js"></script>
        <script src="scripts/jquery.mobile.min.js"></script>
        <script src="plugins/jquery/jRating.jquery.js"></script>
        <script src="plugins/raty/lib/jquery.raty.js"></script>
    </head>
    <body>
        <div data-role="page" id="pageWine" >
            <div data-role="header">
                <h1>Vino Vivo</h1>
                <div data-role="navbar">
                    <ul>
                        <li><a href="stand.jsp" data-transition="none" >Stands</a></li>
                        <li><a href="#" class="ui-btn-active ui-state-persist" >Vins</a></li>
                        <li><a href="vinsDegust.jsp" data-transition="none" rel="external">Commandes</a></li>
                    </ul>
                </div>
            </div>

            <div data-role="main" class="ui-content">
                <a href="index.jsp" data-transition="none" class="ui-btn ui-btn-inline">Accueil</a><br>
                <table>
                    <tr>
                        <td><a href="#" class="ui-btn ui-shadow ui-corner-all ui-icon-search ui-btn-icon-notext">Search</a></td>
                        <td><input type="text" name="tag" value="" size="40" placeholder="Vin à rechercher..."/></td>
                    </tr>
                </table>
                <div data-role="collapsibleset" data-mini="true" data-collapsed-icon="false" data-expanded-icon="false" >
                    <div data-role="collapsible">
                        <h2>1. Calamin Lavaux AOC La Béguine J. et M. Dizerens<br><span>2012, 70cl, 96.60CHF (6 bout.)</span></h2>
                        <p style="font-size: 14px;">Description détaillée du vin</p>
                        <span style="font-size: 14px">Noter le vin</span><br>
                        <div id="star"></div>
                        <p style="font-size: 14px">Evaluer le vin</p>
                        <table>
                            <tr>
                                <td>Tags : </td>
                                <td><input type="text" name="tag" value="" size="30" placeholder="Fruité, boisé, sucré, ..."/></td>
                            </tr>
                        </table>
                        <a href="#" data-transition="none" class="ui-btn ui-btn-inline">Sauvegarder l'évaluation</a>
                        <a href="#" data-transition="none" class="ui-btn ui-btn-inline">Ajouter à la liste de commande</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>2. St-Saphorin Lavaux AOC J. et M. Dizerens<br><span>2012, 70cl, 96.60CHF (6 bout.)</span></h2>
                        <p style="font-size: 14px;">Description détaillée du vin</p>
                        <a href="vin.jsp" rel="external"  data-transition="none" class="ui-btn ui-btn-inline">Evaluer</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>3. Aigle Chablais AOC Merveille des Roches<br><span>2012, 70cl, 111.60CHF (6 bout.)</span></h2>
                        <p style="font-size: 14px;">Description détaillée du vin</p>
                        <a href="vin.jsp" data-transition="none" class="ui-btn ui-btn-inline">Evaluer</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>4. Genève AOC Sauvignon Gris Le Savant<br><span>2012, 75cl, 99.00CHF (6 bout.)</span></h2>
                        <a href="vin.jsp" data-transition="none" class="ui-btn ui-btn-inline">Evaluer</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>5. Necuhâtel AOC Hôpital Pourtalès<br><span>2012, 75cl, 59.40CHF (6 bout.)</span></h2>
                        <a href="vin.jsp" data-transition="none" class="ui-btn ui-btn-inline">Evaluer</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>6. Sancerre AOC L'Esprit de Rudolf Vincent Gaudry<br><span>2011, 75cl, 168.00 (6 bout.)</span></h2>
                        <a href="vin.jsp" data-transition="none" class="ui-btn ui-btn-inline">Evaluer</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>7. Zürich AOC Blauburgunder Staatsschreiberwin<br><span>2012, 75cl, 87.00 (6 bout.)</span></h2>
                        <a href="vin.jsp" data-transition="none" class="ui-btn ui-btn-inline">Evaluer</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>8. Dôle Blavaud AOC Grand Cru J.R. Germanier<br><span>2010, 75cl, 108.00 (6 bout.)</span></h2>
                        <a href="vin.jsp" data-transition="none" class="ui-btn ui-btn-inline">Evaluer</a>
                    </div>
                    <div data-role="collapsible">
                        <h2>9. Côtes du Ventoux AOC Terres de Truffes<br><span>2010, 75cl, 71.40 (6 bout.)</span></h2>
                        <a href="vin.jsp" data-transition="none" class="ui-btn ui-btn-inline">Evaluer</a>
                    </div>
                </div>
            </div>
        </div> 
        <script type="text/javascript">
            $('#pageWine').on('pageinit', function() {
                $.fn.raty.defaults.path = 'lib/img';
                $('#star').raty();
            });
        </script>
    </body>
</html>
