/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abctexteditor;

import abctexteditor.Files.FileSaverPDF;

/**
 *
 * @author rshum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextEditorWindow textEditorWindow = new TextEditorWindow();
        textEditorWindow.setVisible(true);
        FileSaverPDF psf = new FileSaverPDF();
        psf.applyFormat("Capítulo 1\n" +
"La cuna del hidalgo. Nombre, retrato y descripción de sus costumbres. La lectura de los libros de caballerías le hace perder el juicio. El hidalgo decide revivir la caballería andante. Repara sus armas. Busca un nombre para su caballo: Rocinante. El hidalgo inventa a don Quijote. Elige por dama a Dulcinea del Toboso.\n" +
"\n" +
"Capítulo 2\n" +
"En el segundo capítulo se narra la primera salida de don Quijote, solo, y su necesidad de ser armado caballero por el primero que vea. Parte por la mañana y, allegada la noche, entra en una venta que confunde con un castillo. Allí se ríen dos mozas de su aspecto ridículo pero al ventero le impone cierto respeto y le ofrece posada. Mientras don Quijote está comiendo llega un castrador de puercos, lo cual le parece a don Quijote la confirmación de que se encuentra en un castillo\n" +
"\n" +
"Capítulo 3\n" +
"En este capítulo se narra la investidura de don Quijote como caballero. Esto se lo pide al ventero a quien considera señor del castillo y éste le sigue la corriente y le ordena que vele sus armas durante la noche. Entretanto el ventero informa a los demás huéspedes de la locura del protagonista y éstos lo comprueban personalmente cuando intentan quitarle sus armas, ya que les ataca. Se desata una pelea contra don Quijote, que es apedreado, hasta que el ventero le pone fin nombrando caballero al hidalgo, quien inmediatamente después sale en busca de aventuras.\n" +
"\n" +
"Capítulo 4\n" +
"Tras haber sido armado caballero don Quijote parte de la venta en busca de aventuras. Interviene al ver el abuso de poder un labrador, Juan Haldudo, frente a su mozo Andrés. Don Quijote obtiene un éxito momentáneo al confiar en la palabra de honor del opresor pero una vez partido el caballero, el mozo es azotado con más fuerza que antes. Sigue don Quijote y divisa unos mercaderes toledanos a los que quiere hacer confesar que su amada Dulcinea es la doncella más hermosa del mundo. No obstante, no lo consigue y es apaleado por los mercaderes.\n" +
"\n" +
"Capítulo 5\n" +
"Al principio de este capítulo don Quijote, tendido en el camino, se cree Valdovinos. Pasa por allí casualmente un vecino suyo que lo encuentra malparado y lo lleva a su casa. Allí se encuentran al Barbero, al cura, al ama y a la sobrina de don Quijote.\n" +
"\n" +
"Capítulo 6\n" +
"En este capítulo se procede al escrutinio de los libros de don Quijote a los que el ama y la sobrina consideran la causa de su locura. La mayoría de ellos van a ser quemados, aunque algunos se salvan, Aparece también una crítica de la Galatea de Cervantes.\n" +
"\n" +
"Capítulo 7\n" +
"Se termina el escrutinio de los libros de do Quijote y las mujeres los queman. Acto seguido se tapia la biblioteca del caballero y a éste le explican que un sabio, Frestón, la ha hecho desaparecer. Don Quijote coge dinero y elige a Sancho Panza, un humilde labrador al que promete el gobierno de una ínsula, como su escudero. Parten los dos en busca de aventuras sin contárselo a nadie.\n" +
"\n" +
"Capítulo 8\n" +
"La primera aventura tras la segunda salida de don Quijote es la de los molinos de viento. En ésta el caballero no atiende las advertencias de su escudero Sancho y se enfrenta a un molino que confunde con un gigante. Sale malparado. Tras esto sigue una conversación entre Sancho y don Quijote sobre la caballería. Cuando ven dos bultos negros se dirigen hacia ellos. Se trata de dos frailes y don Quijote arremete contra uno de ellos. Cuando Sancho se dispone a robarle sus pertenencias al fraile es apaleado por dos mozos. Entretanto don Quijote se dirige a una señora vizcana que se encontraba cerca de los frailes y desafía a uno de sus acompañantes.\n" +
"\n" +
"Capítulo 9\n" +
"En el noveno Capítulo, primero de la segunda parte, el autor busca la continuación de la historia y afirma haber encontrado el manuscrito de Cide Hamete. Sigue una descripción de Sancho y Rocinante y se retoma el combate entre don Quijote y el vizcaíno. En éste sale don Quijote victorioso y deja marchar al vizcaíno con la condición de presentarse ante Dulcinea.\n" +
"\n" +
"Capítulo 10\n" +
"Don Quijote y Sancho dialoga sobre las caballerías y don Quijote promete a su escudero enseñarle muchos secretos como el bálsamo de Fierabrás contra las heridas. Don Quijote se percata de que su celada está rota y jura no descansar hasta encontrar otra, el yelmo de Mambrino. Le cuenta también a Sancho las comidas de los caballeros andantes.\n" +
"\n" +
"Capítulo 11\n" +
"Los dos protagonistas se encuentran con unos cabreros, con los que cenan y don Quijote mantiene un discurso sobre la Edad de Oro entre la música de un rabel.\n" +
"\n" +
"Capítulos 12 a 14 (HISTORIA INTERCALADA)\n" +
"Marcela, una muchacha huérfana que hasta los 15 años aproximadamente ha vivido con su tío y luego se ha marchado al campo para cuidar de unas ovejas, es tan bella que enamora a todo el que la ve. Uno de éstos es Grisóstomo, un acomodado pastor, que ha andado buscándola y no ha visto correspondido su amor. Por este motivo muere de pena y desesperación y don Quijote, junto con los demás cabreros y Sancho, se dirige al entierro. Allí se lee una canción compuesta por el difunto, en la que manifiesta su desesperación por el amor no correspondido. Marcela hace acto de presencia y todos los presentes la culpan de la muerte de Grisóstomo aunque ella se defiende manteniendo que lo que es amado por hermoso no tiene que amar a quien le ama. Acto seguido se aleja por el campo.\n" +
"\n" +
" \n" +
"\n" +
"Capítulo 15\n" +
"Se despiden don Quijote y Sancho de los cabreros y parten Siguen por un camino cuando Rocinante ve unas yeguas y queda prendado de ellas. Ven esto los dueños de las yeguas, veinte gallegos, y apalean al caballo. Al intentar Sancho y don Quijote defender a su caballo, también son tundidos a palos. Tras esto sigue un diálogo entre los dos personajes quienes atribuyen el molimiento a su mala suerte y afirman haber sido molidos pero no afrentados. Continúan la marcha y llegan a una venta que don Quijote imagina ser castillo.\n" +
"\n" +
"Capítulo 16\n" +
"En la venta don Quijote y Sancho son curados tras su pelea por la mujer del ventero, su hija y Maritornes, que no tardan mucho e comprobar la locura del caballero. Éste que cree haber llegado a un castillo, es acomodado en una cama muy rudimentaria y sueña que la hija del ventero, la dama del castillo, se ha enamorado de él. Por este motivo la confunde con Maritornes, que se había apalabrado para esa noche con una arriero hospedado en la venta, y se acuesta con ella. Acto seguido se desata una pelea nocturna entre Sancho, el arriero, don Quijote, el ventero, Maritornes y un cuadrillero.\n" +
"\n" +
"Capítulo 17\n" +
"Siguen los sucesos de la venta y, a fin de sanar tantas palizas y porrazos se le ocurre a don Quijote confeccionar el bálsamo de Fierabrás, que con sus poderes extraordinarios les curará heridas y chichones. Sancho coincide con su amo en que un moro les ha castigado encantando la venta.\n" +
"\n" +
"A continuación don Quijote se dispone a abandonar la venta, aunque se niega a pagar su estancia. Sancho tampoco quiere pagar y es manteado. El ventero se queda con sus alforjas.\n" +
"\n" +
"Capítulo 18\n" +
"Don Quijote y Sancho reflexionan sobre los sucesos en la venta de Palomeque y culpan de ellos a los encantadores. Siguen por el camino y cuando don Quijote ve dos rebaños de ovejas los confunde con dos ejércitos y con personajes de los libros. Pese a las advertencias de su escudero, el caballero se pone de parte de uno de los ejércitos y arremete contra el otro. Entretanto llegan los pastores y apalean a don Quijote por defender a las ovejas. Don Quijote acaba muy malparado y Sancho está a punto de abandonar a su amo debido a su mala suerte cuando no encuentra las alforjas. No obstante, don Quijote le convence para que no se vaya y atribuye su mala suerte a los encantadores.\n" +
"\n" +
"Capítulo 19\n" +
"La aventura del cuerpo muerto. El bachiller Alonso López de Alcobendas. El caballero de la Triste figura.\n" +
"\n" +
"Capítulo 20\n" +
"Aventura de los batanes. Sancho hace lo que otro no puede hacer por él. Lágrimas y burla de Sancho. Don Quijote impone silencio a Sancho.\n" +
"\n" +
"Capítulo 21\n" +
"Comienza a llover por lo que un barbero utiliza su bacía para cubrirse la cabeza. No obstante, don Quijote la confunde con el yelmo de Mambrino y acomete contra el barbero y le quita su bacía y Sancho los aparejos del asno del barbero. Continúan su camino y don Quijote cuenta para ilustrar a Sancho una novela caballeresca protagonizada por el caballero del Sol. Al final de su historia don Quijote reflexiona sobre las dos clases de linaje que existen en el mundo.\n" +
"\n" +
"Capítulos 22 a 52\n" +
"La liberación de los galeotes (capítulo 22) es uno de los momentos de inflexión más importante de la Primera parte. Don Quijote concede la libertad a una cadena de presos, condenados a remar en las galeras del rey, que iban conducidos por cuadrilleros de la Santa Hermandad. El más bellaco de los galeotes es Ginés de Pasamonte, que está escribiendo la historia de su vida como una novela picaresca, en el que Cervantes reflejó al escritor, y compañero suyo en Lepanto, Gerónimo de Passamonte. El episodio tiene graves consecuencias para caballero y escudero porque serán perseguidos por la Santa Hermandad. Sancho sugiere a don Quijote que se aparten de los caminos y se refugien en Sierra Morena, y así lo hacen.\n" +
"\n" +
"Estamos en el capítulo 23, la novela no terminará hasta el capítulo 52, las aventuras lineales que les suceden a los protagonistas serán ya escasas. Pero a partir de este punto se intercalan relatos adyacentes a la acción principal, uno de los cuales, la novela de El curioso impertinente (caps. 33-35), es una novela exenta, la cual simplemente lee en voz alta uno de los personajes. Cervantes está aprovechando para su Don Quijote «novellas», relatos cortos, previamente escritos. Los otros relatos tienen una cierta relación con la acción principal, y Cervantes consigue la unidad en la diversidad, que era uno de los requisitos más difícil de conseguir en una narración extensa, en prosa o en verso, como lo ejemplifica la Jerusalén conquistada de Lope de Vega, una epopeya que se convirtió en una obra fracasada precisamente por este defecto esencial de falta de unidad.\n" +
"\n" +
"Reanudando nuestro argumento, don Quijote, imitando a Amadís de Gaula (que se retiró a hacer penitencia a la Peña Pobre con el nombre de Beltenebrós al ser rechazado por Oriana), decide quedarse entre los riscos de Sierra Morena en pelota (en pellote) y haciendo extravagancias, y manda a Sancho a llevar un mensaje a Dulcinea. Este se dirige a El Toboso, pero en el camino se encuentra con el cura y el barbero de la aldea de don Quijote que habían salido en su busca, los cuales le convencen para que les conduzca adonde ha quedado el hidalgo. En medio de la narración se habían intercalado los relatos cruzados de dos parejas: Cardenio y Luscinda, Dorotea y don Fernando, en las que el «raro inventor» que era Cervantes consigue la proeza de mantener en tensión unas historias que continuamente se retoman y se abandonan. Es la novela barroca. Juntos todos estos personajes, fingen que la bella e ingeniosa Dorotea es la reina Micomicona, y consiguen sacar a don Quijote de entre los riscos de la sierra. Con el cual llegan de nuevo a la venta de Juan Palomeque (caps. 32-46), cuyo nombre hemos conocido, donde se suceden nuevos episodios: el de los pellejos de vino, un nuevo discurso de don Quijote sobre las armas y las letras, la disputa baciyélmica con el barbero a quien caballero y escudero habían despojado de su bacía de azófar en los capítulos anteriores. Y nuevas novelas intercaladas: ahora la Historia del cautivo, llena de recuerdos cervantinos de su cautiverio en Argel, la cual se entrelaza con la Historia del oidor y de su hija, que a su vez nos lleva a la Historia del mozo de mulas. Fingen un encantamiento de don Quijote y lo encierran en una jaula en la que es conducido, en un carro tirado por bueyes, por el cura y el barbero hasta su casa. En el camino encuentran a un canónigo toledano que viaja acompañado de su comitiva, como un príncipe de la Iglesia que es (caps. 47-50). Con él mantendrán una sabrosa conversación de teoría literaria sucesivamente el cura y don Quijote, en la que Cervantes expuso su teoría literaria sobre la novela, las comedias y el poema heroico. Y así, después de despedirse del canónigo, el cura y el barbero devuelven a don Quijote y a Sancho (después de intercalar una última Historia de Leandra) a su casa.\n" +
"\n" +
"Cervantes dejó abierta la posibilidad de una continuación de su obra, indicando que en su tercera salida don Quijote fue a Zaragoza. Pero al mismo tiempo inventó la existencia de unos pedantescos y latinados académicos de la Argamasilla, que hacían el epitafio de don Quijote como si este hubiera muerto. Los académicos argamasillescos satirizan a los personajes del Quijote, que no salen bien parados de la sátira. Son alusiones en clave contra enemigos literarios de Cervantes (Lope de Vega y sus seguidores, probablemente) al igual que los poemas y el prólogo de los textos preliminares de esta Primera parte.\n" +
"\n" +
"Entre esta Primera y la Segunda parte del Quijote cervantino se publicó el llamado Quijote de Avellaneda (1614). El autor o los autores (Avellaneda es un pseudónimo) de esta obra literariamente estimable realizaron una auténtica corrección del modelo cervantino (un «loco entreverado» con intervalos lúcidos, don Quijote, que recorre España queriendo imponer por la fuerza su propia justicia, atacando frailes y liberando galeotes; y un tonto-listo, Sancho Panza, dispuesto a cambiar de clase social y a ser gobernador o conde). Para neutralizar a estos personajes, socialmente transgresores, Avellaneda los llevó al sitio que la sociedad aristocrática estamental reservaba para ellos: el loco debe estar recluido en el manicomio donde sus actos y sus palabras no constituyan ningún peligro, y así ingresaron a don Quijote en el hospital de locos más famoso de la época, el Nuncio de Toledo; el tonto-listo debe ir a la corte, pero no como conde u obispo o gobernador, sino como bufón eutrapélico para entretener a «los caballeros de buen gusto» en sus diversiones palatinas, como los bufones de los cuadros de Velázquez. Pero Cervantes no les permitió a sus enemigos literarios la adulteración de sus personajes y, en su Segunda parte, reincidió en su modelo transgresor: su don Quijote nunca irá al manicomio, sino que, una vez cumplida su misión, recuperará la razón y morirá pacíficamente en su cama.");
    }
    
}
