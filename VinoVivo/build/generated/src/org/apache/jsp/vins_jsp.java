package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vins_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>VinoVivo</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/jquery.mobile.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/jquery/jRating.jquery.css\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"plugins/raty/demo/css/application.css\">\n");
      out.write("\n");
      out.write("        <script src=\"scripts/jquery.min.js\"></script>\n");
      out.write("        <script src=\"scripts/jquery.mobile.min.js\"></script>\n");
      out.write("        <script src=\"plugins/jquery/jRating.jquery.js\"></script>\n");
      out.write("        <script src=\"plugins/raty/lib/jquery.raty.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div data-role=\"page\" id=\"pageWine\" >\n");
      out.write("            <div data-role=\"header\">\n");
      out.write("                <h1>Vino Vivo</h1>\n");
      out.write("                <div data-role=\"navbar\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"stand.jsp\" data-transition=\"none\" >Stands</a></li>\n");
      out.write("                        <li><a href=\"#\" class=\"ui-btn-active ui-state-persist\" >Vins</a></li>\n");
      out.write("                        <li><a href=\"commande.html\" data-transition=\"none\" rel=\"external\">Commandes</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div data-role=\"main\" class=\"ui-content\">\n");
      out.write("                <a href=\"index.jsp\" data-transition=\"none\" class=\"ui-btn ui-btn-inline\">Accueil</a><br>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"#\" class=\"ui-btn ui-shadow ui-corner-all ui-icon-search ui-btn-icon-notext\">Search</a></td>\n");
      out.write("                        <td><input type=\"text\" name=\"tag\" value=\"\" size=\"40\" placeholder=\"Vin à rechercher...\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <div data-role=\"collapsibleset\" data-mini=\"true\" data-collapsed-icon=\"false\" data-expanded-icon=\"false\" >\n");
      out.write("                    <div data-role=\"collapsible\">\n");
      out.write("                        <h2>1. Calamin Lavaux AOC La Béguine J. et M. Dizerens<br><span>2012, 70cl, 96.60CHF (6 bout.)</span></h2>\n");
      out.write("                        <p style=\"font-size: 14px;\">Description détaillée du vin</p>\n");
      out.write("                        <span style=\"font-size: 14px\">Noter le vin</span><br>\n");
      out.write("                        <div id=\"star\"></div>\n");
      out.write("                        <p style=\"font-size: 14px\">Evaluer le vin</p>\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Tags : </td>\n");
      out.write("                                <td><input type=\"text\" name=\"tag\" value=\"\" size=\"30\" placeholder=\"Fruité, boisé, sucré, ...\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        <a href=\"#\" data-transition=\"none\" class=\"ui-btn ui-btn-inline\">Sauvegarder l'évaluation</a>\n");
      out.write("                        <a href=\"#\" data-transition=\"none\" class=\"ui-btn ui-btn-inline\">Ajouter à la liste de commande</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div data-role=\"collapsible\">\n");
      out.write("                        <h2>2. St-Saphorin Lavaux AOC J. et M. Dizerens<br><span>2012, 70cl, 96.60CHF (6 bout.)</span></h2>\n");
      out.write("                        <p style=\"font-size: 14px;\">Description détaillée du vin</p>\n");
      out.write("                        <a href=\"vin.jsp\" rel=\"external\"  data-transition=\"none\" class=\"ui-btn ui-btn-inline\">Evaluer</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div data-role=\"collapsible\">\n");
      out.write("                        <h2>3. Aigle Chablais AOC Merveille des Roches<br><span>2012, 70cl, 111.60CHF (6 bout.)</span></h2>\n");
      out.write("                        <p style=\"font-size: 14px;\">Description détaillée du vin</p>\n");
      out.write("                        <a href=\"vin.jsp\" data-transition=\"none\" class=\"ui-btn ui-btn-inline\">Evaluer</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div data-role=\"collapsible\">\n");
      out.write("                        <h2>4. Genève AOC Sauvignon Gris Le Savant<br><span>2012, 75cl, 99.00CHF (6 bout.)</span></h2>\n");
      out.write("                        <a href=\"vin.jsp\" data-transition=\"none\" class=\"ui-btn ui-btn-inline\">Evaluer</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div data-role=\"collapsible\">\n");
      out.write("                        <h2>5. Necuhâtel AOC Hôpital Pourtalès<br><span>2012, 75cl, 59.40CHF (6 bout.)</span></h2>\n");
      out.write("                        <a href=\"vin.jsp\" data-transition=\"none\" class=\"ui-btn ui-btn-inline\">Evaluer</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div data-role=\"collapsible\">\n");
      out.write("                        <h2>6. Sancerre AOC L'Esprit de Rudolf Vincent Gaudry<br><span>2011, 75cl, 168.00 (6 bout.)</span></h2>\n");
      out.write("                        <a href=\"vin.jsp\" data-transition=\"none\" class=\"ui-btn ui-btn-inline\">Evaluer</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div data-role=\"collapsible\">\n");
      out.write("                        <h2>7. Zürich AOC Blauburgunder Staatsschreiberwin<br><span>2012, 75cl, 87.00 (6 bout.)</span></h2>\n");
      out.write("                        <a href=\"vin.jsp\" data-transition=\"none\" class=\"ui-btn ui-btn-inline\">Evaluer</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div data-role=\"collapsible\">\n");
      out.write("                        <h2>8. Dôle Blavaud AOC Grand Cru J.R. Germanier<br><span>2010, 75cl, 108.00 (6 bout.)</span></h2>\n");
      out.write("                        <a href=\"vin.jsp\" data-transition=\"none\" class=\"ui-btn ui-btn-inline\">Evaluer</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div data-role=\"collapsible\">\n");
      out.write("                        <h2>9. Côtes du Ventoux AOC Terres de Truffes<br><span>2010, 75cl, 71.40 (6 bout.)</span></h2>\n");
      out.write("                        <a href=\"vin.jsp\" data-transition=\"none\" class=\"ui-btn ui-btn-inline\">Evaluer</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $('#pageWine').on('pageinit', function() {\n");
      out.write("                $.fn.raty.defaults.path = 'lib/img';\n");
      out.write("                $('#star').raty();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
