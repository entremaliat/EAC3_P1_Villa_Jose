package josevilla.ioc.cat.eac3_p1_villa_jose.countries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 */
public class CountriesContent {

    /**
     * An array of sample (countries) items.
     */
    public static final List<CountryItem> ITEMS = new ArrayList<CountryItem>();

    /**
     * A map of sample (countries) items, by ID.
     */
    public static final Map<String, CountryItem> ITEM_MAP = new HashMap<String, CountryItem>();

    private static final int COUNT = 23;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createCountryItem(i));
        }
    }

    private static void addItem(CountryItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id,item);
    }

    private static CountryItem createCountryItem(int position) {
        return new CountryItem(String.valueOf(position), makeTitle(position), makeDetails(position));
    }

    private static String makeTitle(int position) {
        String newTitle;

        switch (position) {
            case 1:
                newTitle = "Afganistán";
                break;
            case 2:
                newTitle = "Bahamas";
                break;
            case 3:
                newTitle = "Cabo Verde";
                break;
            case 4:
                newTitle = "Dinamarca";
                break;
            case 5:
                newTitle = "Ecuador";
                break;
            case 6:
                newTitle = "Filipinas";
                break;
            case 7:
                newTitle = "Gabón";
                break;
            case 8:
                newTitle = "Haití";
                break;
            case 9:
                newTitle = "India";
                break;
            case 10:
                newTitle = "Jamaica";
                break;
            case 11:
                newTitle = "Kazajistán";
                break;
            case 12:
                newTitle = "Laos";
                break;
            case 13:
                newTitle = "Macedonia del Norte";
                break;
            case 14:
                newTitle = "Namibia";
                break;
            case 15:
                newTitle = "Omán";
                break;
            case 16:
                newTitle = "Pakistán";
                break;
            case 17:
                newTitle = "Reino Unido";
                break;
            case 18:
                newTitle = "Samoa";
                break;
            case 19:
                newTitle = "Tailandia";
                break;
            case 20:
                newTitle = "Ucraina";
                break;
            case 21:
                newTitle = "Vanuatu";
                break;
            case 22:
                newTitle = "Yemen";
                break;
            default:
                newTitle = "Zambia";
                break;
        }

        return newTitle;
    }

    private static String makeDetails(int position) {
        String newContent;

        switch (position) {
            case 1:
                newContent = "Las excavaciones de los yacimientos prehistóricos permitieron saber que los humanos vivían en lo que hoy es Afganistán hace al menos 50 000 años, y que las comunidades agrícolas de la zona fueron de las primeras en el mundo. El territorio fue un punto de encuentro donde numerosas civilizaciones interactuaron y a menudo confrontaron.\n" +
                        "\n" +
                        "Ha sido el hogar de varios pueblos a través de diferentes épocas, destacándose los iranios, que tuvieron una importante función en el desarrollo de las civilizaciones en Asia Central. El territorio fue incorporado a importantes imperios, entre ellos el Imperio aqueménida, el Imperio Macedónico, el Imperio Maurya y el Imperio Árabe.\n" +
                        "\n" +
                        "De la Prehistoria en el país se conoce todavía poco. Sin embargo, durante las misiones de excavación francesas se descubrieron en Mundigak siete niveles de civilización que se escalonaban desde el IV milenio hasta alrededor del año 500 a. C. Los arios, provenientes del actual Irán, llegados del oeste, ocuparon el país en una época indeterminada y establecieron su etnia básica. Bajo la Dinastía aqueménida, Afganistán, íntegramente conquistado por Ciro, rey de Persia, fue dividido en 5 satrapías por Darío I. La pax iránica reinó en el país durante dos siglos, lo que le permitió participar del gran esplendor de Irán y dejarse impregnar por la reforma religiosa de Zaratustra. La conquista de Alejandro Magno en el año 331 a.C. provocó, más que en cualquier otra parte, una simbiosis entre Grecia, Irán y la India.";
                break;
            case 2:
                newContent = "Las islas estuvieron ocupadas, desde al menos quinientos años antes de la llegada de los europeos, por un grupo de personas llamadas lucayos, descendientes de los aborígenes arahuacos, que vivían originalmente al norte de Sudamérica, en las islas del Caribe y en Florida. Se caracterizaban por tener una vida apacible y por vivir de la pesca y del cultivo del maíz.\n" +
                        "\n" +
                        "En 1492 Cristóbal Colón desembarcó en la orilla de una pequeña isla, llamada Guanahani por los autóctonos. Colón le puso el nombre de San Salvador y reclamó la isla para España. Allí, Colón sometió a los lucayos al trabajo de la búsqueda de oro. Se estima que 40,000[cita requerida] arahuacos perdieron la vida por resistirse a trabajar en esa empresa. La posterior desaparición de los arahuacos en tan solo veinticinco años, y la de otros pueblos, se debió en gran medida a ésta y a posteriores expediciones europeas a la región.\n" +
                        "\n" +
                        "Desde finales del siglo XV hasta finales del siglo XVIII, las Bahamas estuvieron bajo soberanía española, aunque las islas, por su situación estratégica en la \"ruta del Galeón\", y por formar el archipiélago un auténtico laberinto insular, paulatinamente fueron transformándose en escondites y nidos de piratas, bucaneros y filibusteros, especialmente ingleses. Así en el siglo XVIII, los lealistas británicos que habían dejado Nueva Inglaterra, a causa de los sentimientos anti británicos existentes en esas colonias, se trasladaron a las islas. Debido al gran número de colonos británicos en las islas, la soberanía del archipiélago se traspasó de España al Reino Unido, siendo las Bahamas declaradas colonia británica en 1784.\n" +
                        "\n" +
                        "En plena Segunda Guerra Mundial, el Duque de Windsor (anteriormente el rey del Reino Unido Eduardo VIII) fue nombrado Gobernador general de las Bahamas. Viajó a esas islas en compañía de su esposa, la duquesa de Windsor Wallis Simpson en 1940, para ejercer el cargo de Gobernador general hasta 1945. En 1973, los habitantes de las Bahamas votaron a favor de la independencia y se declararon independientes del Reino Unido, aunque permanecieron dentro de la Mancomunidad Británica de Naciones (Commonwealth).";
                break;
            case 3:
                newContent = "En el siglo XV, cuando los portugueses colonizaron el archipiélago, las islas hacían justicia a su nombre: estaban cubiertas por una densa vegetación tropical, que contrastaba con sus rocas volcánicas negras y el mar azul. No hay evidencia de que estuvieran pobladas antes de la llegada de los colonos, pero se considera probable que los árabes hubiesen visitado en siglos anteriores la isla de Sal para proveerse de esa sustancia. En 1462, los primeros colonos portugueses desembarcaron en lo que hoy es Santiago y fundaron la ciudad europea más antigua del trópico: Ribeira Grande (hoy Cidade Velha). Los portugueses introdujeron el cultivo de la caña de azúcar, pero el clima seco no era favorable. Así que se dedicaron fundamentalmente al comercio de esclavos, provenientes sobre todo de la costa oeste de África. El auge del esclavismo revolucionó la economía de Cabo Verde en solo unos pocos años. Mientras que en 1506 era una de las posesiones portuguesas en África que menos rentas proporcionaban a la Corona, para 1510 se había convertido en la segunda que más rentaba, solo superada por la Mina de Oro.\n" +
                        "\n" +
                        "Para los portugueses, las islas, situadas entre África, América y Europa, tenían gran interés estratégico. Desde 1517, quedó establecida la ruta oficial portuguesa de transporte de esclavos desde África hacia América, haciendo escala en Cabo Verde (la esclavitud se abolió en 1876). El asalto reiterado de piratas ingleses, neerlandeses y franceses obligó a los portugueses a trasladar colonos agricultores del Alentejo (al sudeste de Portugal, «granero» de ese país) al archipiélago. La contracción de la actividad agrícola –famosa entre los siglos XVII y XIX por su algodón - provocó la emigración masiva de caboverdianos: la mayoría hacia Guinea-Bissau (ex colonia portuguesa muy vinculada al archipiélago), y posteriormente hacia Angola, Mozambique, Senegal, Brasil y, principalmente, Estados Unidos. En el siglo XIX, la prosperidad de las islas fue decayendo lentamente, debido a que habían cesado los dos ingresos que tenía: el algodón y los esclavos, por la prohibición mundial de la trata de esclavos. Entre 1941 y 1948, una prolongada hambruna provoca la muerte de un gran número de personas, unas 50 000 (casi un tercio de la población), ante la « indiferencia total » del gobierno portugués: No llegó a enviarse ninguna ayuda humanitaria.";
                break;
            case 4:
                newContent = "En la etapa de los pueblos germánicos (50 a. C.-789 d. C.), aproximadamente en el año 200, se separó el idioma protonórdico del idioma protogermánico, aunque se cree que las diferencias son mínimas. Durante la época vikinga (789-1100 d. C.) nace el idioma nórdico antiguo como evolución del protonórdico. Los dialectos de este idioma se van a convertir en los idiomas nórdicos actuales: sueco, noruego, danés e islandés.\n" +
                        "\n" +
                        "Dinamarca fue unificada por Harald Blåtand alrededor de 980. En el siglo XI los vikingos daneses y noruegos atacaron en la mayor parte de Europa Occidental, llegando a controlar parte de Inglaterra, y fundando otros estados, como el Ducado de Normandía. Además, los vikingos daneses hicieron numerosas expediciones al mar Mediterráneo. En sus primeras expediciones, pasaron por el norte y este de la península ibérica, haciendo incursiones en estos territorios. Se sabe que causaban gran terror, bajas y pérdidas económicas a los recientes estados cristianos del norte de la Península.\n" +
                        "\n" +
                        "Por otro lado, es sabido que los vikingos quemaron Sevilla (año 844) hasta sus cimientos, lo cual no agradó en absoluto al emir de Córdoba el cual reorganizó una sólida defensa contra las incursiones vikingas, por lo que éstos perdieron su interés por al-Ándalus y fueron a saquear reinos más débiles en el Mediterráneo. Crearon el Reino de Sicilia. Además, se sabe que intentaron saquear Roma y llevar la cabeza del papa a Dinamarca. Sin embargo los conocimientos geográficos de los vikingos dejaban bastante que desear. Navegaron hasta una ciudad al norte de Italia llamada \"Luna\" y al ver sus torres de iglesias doradas, junto con el cansancio que traían después de haber navegado durante un año, hizo que no pararan a reflexionar sobre si aquella ciudad realmente era Roma. La saquearon y la cabeza que más tarde colgaría en algún lugar de Dinamarca fue la del obispo de Luna.\n" +
                        "\n" +
                        "Llegaron incluso hasta Constantinopla, capital del Imperio bizantino sitiándola (de ahí que en danés exista un sinónimo para denominar a la actual Estambul: \"Miklagård\" = \"Granja grande, patio grande\"). El emperador bizantino quedó tan impresionado de la fuerza vikinga que, tras la derrota de éstos, pidió un regimiento de mercenarios vikingos para que fueran su guardia personal (Guardia Varega), aunque ésta la formaran en su mayoría vikingos suecos. La era vikinga termina alrededor del año 1100, cuando acaban las incursiones vikingas. Muchos historiadores coinciden en que el fin de la era vikinga fue en la batalla de Stamford Bridge en 1066. A causa de la gran influencia vikinga en Gran Bretaña, el idioma inglés actual tiene ciertas palabras parecidas al danés, sueco y noruego ya que todos estos son dialectos del nórdico antiguo. De hecho, si se juntaran en la actualidad un danés, un noruego y un sueco hablando cada uno en su respectivo idioma (de manera pausada) lograrían mantener una conversación relativamente fluida, ayudándose los unos a los otros.\n" +
                        "\n" +
                        "Posteriormente, Dinamarca ha controlado durante siglos Noruega e Islandia, y ocasionalmente, Suecia (Unión de Kalmar), parte de las islas Vírgenes, parte de la costa del Báltico y lo que ahora es el norte de Alemania. Estonia fue conquistada por parte de una cruzada danesa para evangelizar los territorios estonios paganos, liderada por Valdemar II el Vencedor y el arzobispo Anders Sunesen, además de otro arzobispo influyente de la época, Absalon (fundador de la ciudad de Copenhague), vencieron en la batalla de Lyndanisse, cerca de Tallin, en 1219. Según el mito, la bandera danesa \"Dannebrog\" (La Gran Cruz Nórdica blanca simboliza el cristianismo de Dinamarca limpio, puro; sobre fondo rojo que simboliza la sangre de los enemigos de Dinamarca) cayó del cielo para que los daneses ganaran la batalla. Los territorios estonios fueron vendidos en 1346 por parte del rey danés Cristóbal II, a la Orden Teutónica por 190 00 marcos, con la oposición papal.";
                break;
            case 5:
                newContent = "Los primeros asentamientos registrados en el actual territorio ecuatoriano datan 13 500 años, en El Inga, Cultura Las Vegas, Chobsi, Cubilán y pinturas rupestres amazónicas del Paleoindio.\n" +
                        "\n" +
                        "La época precolombina comprende cuatro períodos: Paleoindio, Formativo, de Desarrollo Regional y de Integración o Periodo Incaico. Durante el periodo formativo se descubrió la cerámica, con la posibilidad de que la cultura Valdivia se una de las alfareras más antiguas de América. También se domesticaron especies vegetales, gracias a la diversidad biológica y climática de la región; entre ellas, cabe mencionar: piña, papaya, zapallo, maní, tomate, tomate de árbol, naranjilla, ají y cacao.\n" +
                        "\n" +
                        "La agricultura con un alto nivel de desarrollo en las zonas secas muestra restos de obras para recolección e infiltración de agua, y un sistema social conocidas como albarradas, que alteran el paisaje; las laderas de montañas en muchas regiones del país tienen restos de andenerías; mientras que en las zonas bajas y húmedas, en las vegas de ríos y orillas de lagos, se encuentran restos de camellones o grandes camas de cultivo con riego por inundación. Este último sistema es especialmente interesante por su dimensión en las cuencas de los ríos del litoral, como el río Guayas, con miles de hectáreas dedicadas al cultivo en camellones de gran tamaño.\n" +
                        "\n" +
                        "La cultura Manteña, ubicada en la parte central del litoral ecuatoriano, controló una amplia ruta de comercio marítimo, que se extendió desde el actual Chile hasta México, basada en la navegación de cabotaje con grandes balsas impulsadas por velas. En el litoral norte, la cultura La Tolita produjo una metalurgia ornamental de alto nivel, principalmente en oro, plata y aleación de platino. La alfarería de las culturas Bahía y Jama-Coaque es recargada de detalles, y recuerda un tanto a la asiática, dando lugar a teorías de intercambio cultural transoceánico que no han podido probarse. Los pueblos de la sierra norte construyeron complejos funerarios y astronómicos como el de Cochasquí.\n" +
                        "\n" +
                        "El territorio de Ecuador formó parte del Imperio Inca del Norte hasta la conquista española en 1533. A la llegada de los incas, se estima que habitaban en el territorio del actual Ecuador más de 36 nacionalidades, entre las cuales algunas de las más numerosas eran: Pastos, Caranquis, Imbayas, Paltas, Puruháes, Panzaleos, Cañaris, Hambatus. La influencia incaica se hizo sentir especialmente en el callejón interandino del sur y centro del país, que formaron parte del Tahuantinsuyo; la región norte se mantuvo parcialmente independiente hasta la llegada de los españoles, y tiene una de las mayores presencias de fortalezas o en el imperio Inca; mientras que las regiones de la costa y la Amazonía mantuvieron su independencia. Durante el imperio Icario, se construyeron algunos asentamientos con evidente influencia cuzqueña, siendo de los más importantes Ingapirca (aún se conserva buena parte de los restos arqueológicos) y Tumipampa (Tomebamba) (la ciudad de Cuenca fue fundada sobre la última aunque se conservan sus ruinas en algunos sectores).";
                break;
            case 6:
                newContent = "Hasta hace poco, se pensaba que los restos humanos más antiguos hallados en el archipiélago filipino correspondían al hombre de Tabon —con una antigüedad de 22 000 a 24 000 años, pero fueron reemplazados por el metatarso del hombre de Callao, que según el método del uranio–torio tiene 67 000 años de antigüedad. Existen varias teorías sobre los orígenes de los primeros habitantes de las islas. Landa Jocano sugiere que los antepasados de los filipinos actuales surgieron y se desarrollaron localmente. Por su parte, la teoría del origen isleño de Wilhelm Solheim postula que el poblamiento del archipiélago se dio a través de las rutas de comercio que provenían de la zona de Sonda alrededor de los años 48 000 a 5000 a. C., en vez de una migración a gran escala. La teoría de la expansión austronesia afirma que varios grupos malayo-polinesios procedentes de la isla de Taiwán comenzaron a migrar a Filipinas alrededor del 4000 a. C., desplazando a los primeros pobladores. Los negritos estuvieron entre los primeros habitantes de las islas, pero la fecha de su aparición aún se desconoce. Para el año 1000 a. C., los habitantes del archipiélago se habían organizado en cuatro tipos de grupos sociales: las tribus de cazadores-recolectores, sociedades guerreras, plutocracias pequeñas y principados con centro en los puertos marítimos.\n" +
                        "\n" +
                        "En el transcurso de los siguientes siglos, el comercio con los pueblos marítimos y otros países asiáticos trajo consigo la influencia del islam, el budismo y el hinduismo. Durante este tiempo no hubo ningún Estado político unificador que abarcara todo el archipiélago filipino. En su lugar, las islas estaban divididas entre varias talasocracias que a menudo luchaban entre sí, gobernadas por varios datus, rajás o sultanes. Entre ellos estaban los reinos de Manila, Namayan y Tondó, los rajanatos de Butuan y Cebú y los sultanatos de Maguindanao y Sulú. Algunas de estas sociedades fueron parte de los imperios malayos de Srivijaya, Madjapahit y Brunéi. El islam llegó a Filipinas por medio de comerciantes y algunos proselitistas provenientes de Malasia e Indonesia. De este modo, en el siglo xv el Islam se estableció en el archipiélago Sulú, y se tiene constancia de que en 1656 ya había alcanzado Mindanao, Luzón y las Bisayas.";
                break;
            case 7:
                newContent = "Según las evidencias arqueológicas, Gabón ha estado habitado desde hace al menos 10 000 años. Los primeros habitantes de zona fueron los pigmeos, sustituidos y absorbidos más tarde por tribus bantúes.\n" +
                        "\n" +
                        "Los primeros europeos en llegar a Gabón fueron comerciantes portugueses, que llegaron a la región en el siglo XV; en el siglo siguiente llegaron comerciantes holandeses, franceses y británicos. En el siglo XVIII se formó un reino llamado Orungu.\n" +
                        "\n" +
                        "Gabón se convirtió en protectorado francés gracias a los tratados firmados por Francia con varios jefes de las tribus locales en 1839 y 1841. La capital fue fundada por esclavos liberados por las autoridades francesas de un navío brasileño. Estos esclavos liberados fundaron un asentamiento al que pusieron por nombre Libreville («ciudad libre» en francés).\n" +
                        "\n" +
                        "En 1875, el explorador francés Pierre Savorgnan de Brazza capitaneó su primera misión a la zona de Gabón−Congo. Fundó la ciudad de Franceville antes de convertirse en gobernador de la colonia. Cuando Francia ocupó lo que hoy es Gabón en 1885, varios grupos bantúes vivían en el área.\n" +
                        "\n" +
                        "En 1910, Gabón pasó a ser uno de los cuatro territorios del África Ecuatorial Francesa, una federación que existió hasta 1959. Estos territorios se independizaron el 17 de agosto de 1960. El primer presidente de Gabón, elegido en 1961, fue Léon M'ba, siendo El Hadj Omar Bongo su vicepresidente.\n" +
                        "\n" +
                        "Tras su ascensión al poder, M'ba suprimió la prensa, prohibió las manifestaciones, reprimió la libertad de expresión, apartó del poder gradualmente a otros partidos políticos y cambió la Constitución según las directrices de Francia para concentrar el poder en la presidencia. Cuando M'ba disolvió la Asamblea Nacional en enero de 1964 para instituir un gobierno monopartidista, el ejército dio un golpe de estado con el fin de destituirlo y restablecer la democracia parlamentaria. En menos de 24 horas, tropas francesas habían entrado en el país para restituir a M'ba en el poder. En la actualidad, aún quedan soldados franceses en Gabón.\n" +
                        "\n" +
                        "Cuando M'Ba falleció en 1967, lo sustituyó Omar Bongo, que en 1968 estableció un sistema de partido único —el Partido Democrático Gabonés (PDG)—, y fue el jefe del estado desde entonces hasta su muerte en 2009.\n" +
                        "\n" +
                        "A cambio del apoyo del Elíseo, que puede intervenir para derrocarlo, Bongo acepta poner a disposición de Francia parte de la riqueza de Gabón y, en particular, de sus recursos estratégicos de petróleo y uranio. En cuanto a las cuestiones políticas internacionales, el Gabón se suma a París.\n" +
                        "\n" +
                        "En 1968, Omar Bongo fue obligado por Francia a reconocer la pseudo-independencia del Biafra (Nigeria sudoriental). Incluso debe aceptar que el aeropuerto de Libreville sirva como centro de suministro de armas al colonel Ojukwu (el líder secesionista de Biafra). También será de Gabón que los mercenarios de Bob Denard tratarán de desestabilizar el régimen marxista-leninista de Benín.\n" +
                        "\n" +
                        "En 1990, el descontento por la situación y el deseo de libertades políticas provocaron violentas manifestaciones y huelgas por todo el país, lo que condujo a la implantación de un régimen multipartidista y la elaboración de una Constitución democrática que entró en vigor en marzo de 1991. En 1993 Bongo fue reelegido en unas elecciones de dudosa imparcialidad, lo que condujo a un gobierno de unidad nacional en el que figuraban varios miembros de la oposición.\n" +
                        "\n" +
                        "Un referéndum realizado en 1995 dio a Bongo la facultad de reformar la constitución, y esta reforma dio lugar a elecciones presidenciales y legislativas en 1997. Al año siguiente convocó elecciones anticipadas, que ganó con holgura cuando cumplía 31 años ininterrumpidos en el poder. Jean-François Ntoutoume fue designado primer ministro.\n" +
                        "\n" +
                        "El 8 de junio de 2009, el presidente Omar Bongo murió en una clínica española de Barcelona. Le sucedió Rose Francine Rogombé, presidenta del senado, que se convirtió en presidenta provisional del país hasta las elecciones de agosto de ese mismo año. Ali Bongo Odimba, hijo del fallecido, ganó estas elecciones, aunque las sospechas de fraude electoral provocaron disturbios en Port-Gentil, tradicional feudo de la oposición.";
                break;
            case 8:
                newContent = "Antes de la llegada de los primeros europeos, la que luego sería llamada isla La Española estaba habitada por dos etnias: los arahuacos —cuya rama local es conocida como los taínos— y los caribes. Estos últimos habían iniciado su ingreso a la isla poco tiempo antes de la llegada de los occidentales, y estaban desplazando a los taínos de sus posiciones; no obstante, en la sección occidental de la isla —actualmente Haití— la gran mayoría de la población era de origen taíno, reunida en los cacicazgos de Marién y de Jaragua.\n" +
                        "\n" +
                        "El navegante Cristóbal Colón llegó a la española actual Republica Dominicana el 5 de diciembre de 1492, en un área que actualmente se conoce como Môle Saint-Nicolas y reclamó la isla para la Corona de Castilla. Diecinueve días más tarde, su nave Santa María encalló cerca del actual sitio de Cabo Haitiano. Colón dejó 39 hombres en la isla, quienes fundaron el asentamiento de La Navidad, con lo que la isla se incorporó al Imperio español.\n" +
                        "\n" +
                        "Los marineros trajeron enfermedades infecciosas endémicas de Europa. Los nativos carecían de inmunidad a estas nuevas enfermedades y murieron en gran número debido a las epidemias; la primera epidemia de viruelas registrada en América estalló en La Española en 1507. Paralelamente, los indígenas fueron sometidos al sistema de encomienda, que —en una relación muy similar a la esclavitud— obligaba a los nativos a trabajar en las minas de oro y plantaciones; los nativos fueron expulsados de sus pueblos para llevarlos a trabajar en las plantaciones o industrias específicas. La Corona Española aprobó en 1512 y 1513 las Leyes de Burgos, que prohibieron el maltrato de los nativos, y obligaron a los españoles a educarlos en la doctrina cristiana, dándole además el marco legal a las encomiendas. No obstante, la población indígena disminuyó rápidamente y fue suplantada por inmigrantes europeos y esclavos africanos.\n" +
                        "\n" +
                        "A comienzos del siglo XVII, debido al auge que había adquirido el comercio informal de los colonos criollos de la isla, y que iba en contra del monopolio que pretendía la metrópoli, el gobernador español Antonio de Osorio ordenó entre 1605 y 1606 la despoblación de la zona central y oeste de la isla con el fin de frenar esa práctica. Con el tiempo, en las zonas despobladas de la parte oeste se fueron asentando los bucaneros, hombres que vivían de la caza de reses y cerdos cimarrones, el comercio de pieles y el cultivo de tabaco, así como los filibusteros, ambos de origen francés. Primero ocuparon la Isla de la Tortuga y luego La Española propiamente dicha; entre ellos se encontraba Bertrand d'Ogeron, que tuvo éxito en el cultivo del tabaco, y que reclutó a muchas familias coloniales francesas de Martinica y Guadalupe. Más tarde estos poblamientos determinaron que la parte occidental de la isla fuera reclamada por Francia. En 1697, España cedió a Francia esa parte de la isla por el Tratado de Ryswick, constituyéndose el Saint-Domingue francés.\n" +
                        "\n" +
                        "A mediados del siglo XVIII, el Saint-Domingue colonial, ocupado por Francia bajo un férreo y cruel sistema esclavista, contaba con una población de 300 000 esclavos y apenas 12 000 personas libres, blancos y mulatos principalmente.";
                break;
            case 9:
                newContent = "Las pinturas de la Edad de Piedra en los abrigos rupestres de Bhimbetka en Madhya Pradesh son las huellas más antiguas conocidas de la vida humana en la India. Los primeros asentamientos humanos permanentes aparecieron hacia el 6000 a. C. y poco a poco se desarrollaron en lo que hoy se conoce como la cultura del valle del Indo, la cual tuvo su florecimiento alrededor del año 3300 a. C., en Pakistán.\n" +
                        "\n" +
                        "Tras la desaparición de esa cultura, comenzó el período védico, que sentó las bases del hinduismo y otros aspectos culturales de la sociedad india temprana, periodo que terminó en el 500 a. C. Alrededor del año 550 a. C., se establecieron en todo el país muchos reinos independientes y otros Estados conocidos como \"majayanapadas\".\n" +
                        "\n" +
                        "En el siglo III a. C., la mayor parte del sur de Asia fue conquistada por Chandragupta Maurya para unirlo al Imperio Maurya, el cual floreció bajo el mando de Asoka el Grande.\n" +
                        "\n" +
                        "Desde el siglo III d. C. y durante algo más de dos siglos, la dinastía gupta llevó al imperio a un período de prosperidad que se conoce como la antigua \"Edad de oro de la India\".\n" +
                        "\n" +
                        "En siglos posteriores, los imperios de los chalukia, los chola y los viyaia nagara se desarrollaron en la parte meridional de la India. La ciencia, los avances tecnológicos, la ingeniería, el arte, la lógica, los lenguajes, las obras literarias, las matemáticas, la astronomía y la religión tuvieron un periodo de prosperidad y desarrollo bajo el patrocinio de estos reyes.\n" +
                        "\n" +
                        "Tras las invasiones desde el Asia central entre los siglos X y XII, gran parte del norte de la India cayó bajo el dominio del Sultanato de Delhi (1206-1526) y más tarde del Imperio mogol (1526-1707).\n" +
                        "\n" +
                        "Bajo el reinado de Akbar el Grande (siglo XVI), la India disfrutó de un amplio progreso cultural y económico, así como de una época de armonía religiosa. Gradualmente, los emperadores mogoles ampliaron sus imperios para cubrir gran parte del subcontinente. Sin embargo, el poder dominante en el noreste de la India fue el reino Ahom de Assam, uno de los pocos que se resistieron a la dominación de los mogoles. Durante el siglo XVI, la primera gran amenaza para el poder imperial mogol provino del rey rajput Maha Rana Pratap de Mewar, y más tarde de un Estado indio conocido como Imperio maratha, que en el siglo XVIII dominó gran parte del territorio de la India.";
                break;
            case 10:
                newContent = "Los primeros pobladores de la isla fueron los arahuacos y los taínos, que llegaron a la isla entre el 1000 y el 400 a. C. Se mantuvieron en la isla hasta la llegada de los españoles.\n" +
                        "\n" +
                        "Jamaica fue posesión española después de que Cristóbal Colón llegara a la isla en 1494. La expedición venía de Cuba y La Española, donde lo informaron de la existencia de Xaymaca, que quiere decir, en lengua indígena, “lugar del oro bendecido”. Los expedicionarios se llevaron una desilusión cuando al llegar a Jamaica descubrieron que en la isla no había oro, sino bauxita, que los indígenas llamaban \"oro bendecido\". Colón fue almirante y gobernador de la isla hasta su regreso. El fin del control español de la isla vino después de varios ataques de piratas, bucaneros y corsarios, y de tropas inglesas en 1655, que desafiaron la Bula Papal que declaraba que todos los territorios del nuevo mundo pertenecían a España y Portugal. Jamaica fue el único territorio de envergadura cedido a Inglaterra. Las otras Grandes Antillas, incluida Cuba, La Española (salvo Haití) y Puerto Rico siguieron bajo soberanía española hasta 1898.\n" +
                        "\n" +
                        "Los ingleses atacaron la isla en 1596, seguido de otros ataques en 1603, 1640, 1643 y 1655, cuando el almirante inglés William Penn y el general Robert Venables tomaron finalmente la isla. En sus primeros 200 años de dominio británico, Jamaica se convirtió en el mayor exportador de azúcar del mundo, produciendo 77 000 toneladas al año entre 1820 y 1824. Esta productividad jamás se habría logrado sin la mano de obra esclava traída de África.\n" +
                        "\n" +
                        "Tras una serie de revueltas, la esclavitud fue oficialmente abolida en 1834. Al principio del siglo XIX, la gran dependencia del Imperio británico de la esclavitud hizo que la población de afroamericanos en la isla fuera 20 veces mayor que la de blancos, situación que amenazaba constantemente con revueltas y conflictos. Tras la liberación de los esclavos negros, estos comienzan a huir hacia las montañas, provocando una guerra de guerrillas que duró 76 años y causó gastos a la corona inglesa superiores a 250 000 libras esterlinas.\n" +
                        "\n" +
                        "La Revolución francesa y el surgimiento del conflicto que dio nacimiento a la rebelión en Haití, se fue propagando por todas las islas, y en 1789 los ingleses temían que sus esclavos se rebelaran. Así, en 1795 comienza la segunda guerra de guerrillas inspirada por el ejemplo de libertad de los haitianos. Como consecuencia de estas rebeliones, en 1953 y 1957 se logran avances constitucionales, como plena autonomía gubernamental local.";
                break;
            case 11:
                newContent = "Kazajistán ha estado habitado desde el Neolítico: el clima y el terreno de la región son los más adecuados para la práctica del pastoreo por parte de los nómadas. Los arqueólogos creen que los primeros seres humanos domesticaron el caballo en las vastas estepas de la región.\n" +
                        "\n" +
                        "Asia Central fue habitada originalmente por indo-iranios. El más conocido de esos grupos fue el de los escitas nómadas. El pueblo túrquico comenzó a asentarse en esta región a partir por lo menos del siglo V a. C., posiblemente antes, y terminó convirtiéndose en el componente étnico dominante de Asia Central. Mientras que las ciudades antiguas de Taraz (Aulie-Ata) y Turkestán habían servido durante mucho tiempo como importantes estaciones de paso a lo largo de la Ruta de la Seda conectando el Este y el Oeste, la consolidación política real comenzó con la invasión de los mongoles de principios del siglo XIII. Bajo el Imperio mongol se establecieron regiones administrativas, y estas cayeron finalmente bajo el emergente Kanato kazajo.\n" +
                        "\n" +
                        "A lo largo de este período la vida tradicional nómada y una economía basada en la ganadería continuaron dominando la estepa. En el siglo XV, una clara identidad kazaja comenzó a surgir entre las tribus túrquicas, proceso que se consolidó a mediados del siglo XVI con la aparición de una cultura, economía e idioma kazajos bien diferenciados.\n" +
                        "\n" +
                        "Sin embargo, la región fue foco de las disputas cada vez mayores entre los emires kazajos nativos y los pueblos vecinos de habla persa hacia el sur. A comienzos del siglo XVII, el Kanato kazajo se encontraba agobiado por el impacto de las rivalidades tribales, que habían dividido efectivamente a la población en las Grandes, Medias y Pequeñas hordas (jüz). La desunión política, las rivalidades tribales, y la importancia cada vez menor de las rutas comerciales por tierra entre Oriente y Occidente debilitaron al Kanato kazajo.\n" +
                        "\n" +
                        "Durante el siglo XVII los kazajos lucharon contra los oirates, una federación de tribus mongoles occidentales, incluyendo los zúngaros. El comienzo del siglo XVIII marcó el cenit del Kanato kazajo. Durante este período la Pequeña horda participó en la guerra de 1723-1730 contra los dzhungaros, siguiente a su invasión, denominada la \"Gran Desastre\", de territorios kazajos. Los dzhungaros se hicieron de los pastos de los vencidos kazajos, tomando numerosos cautivos, y masacrando clanes enteros. Bajo el liderazgo de Abul Khair Khan, los kazajos obtuvieron importantes victorias sobre los dzhungaros en el Río Bulanty en 1726 y en la Batalla de Anrakay en 1729. Ablai Khan participó en las batallas más significativas contra los dzhungaros desde los años 1720 a los años 1750, por las cuales fue declarado \"batyr\" (héroe) por el pueblo. Los kazajos también fueron víctimas de asaltos constantes por parte de los calmucos del Volga.";
                break;
            case 12:
                newContent = "Los vestigios de la historia de Laos se remontan al reino de Lan Xang, fundado en el siglo XIV, que duró hasta el siglo XVIII, cuando Siam invadió y asumió el control de los principados separados que quedaban. Para evitar una costosa guerra con los franceses, el rey de Siam les cedió a ellos las tierras hoy conocidas como Laos, y éstas fueron incorporadas a la Indochina Francesa en 1893.\n" +
                        "\n" +
                        "Tras una breve ocupación japonesa durante la Segunda Guerra Mundial, el país declaró su independencia en 1945, pero los franceses reafirmaron su control y sólo en 1950 Laos obtuvo una semi-autonomía como un \"estado asociado\" dentro de la Unión Francesa. Además, los franceses continuaron teniendo el control de facto hasta 1954, cuando Laos obtuvo la independencia completa como una monarquía constitucional. Bajo una exención especial de la Convención de Ginebra, el ejército de entrenamiento francés continuó apoyando al Ejército Real de Laos.\n" +
                        "\n" +
                        "En 1955, el Departamento de Defensa de Estados Unidos creó una oficina especial de evaluación de programas para suplantar el apoyo francés del Ejército Real de Laos contra el comunista Pathet Lao como parte de la política de contención de Estados Unidos.\n" +
                        "\n" +
                        "Las tensiones políticas en el vecino Vietnam arrastraron a Laos a la Segunda Guerra de Indochina, un factor desestabilizante que contribuyó a la Guerra Civil de Laos y varios golpes de Estado. El ejército norvietnamita invadió y ocupó porciones del este de Laos. El ejército norvietnamita, con sus potentes armas incluyendo artillería pesada y carros de combate fue el auténtico poder detrás de la insurgencia de Pathet Lao. Significantes bombardeos aéreos por Estados Unidos se sucedieron con la intención de este país de eliminar bases norvietnamitas en Laos e interrumpir las líneas de abastecimiento en el sendero Ho Chi Minh. Estados Unidos intervino de forma oculta a través de la Operación Estrella Blanca.\n" +
                        "\n" +
                        "La guerra tuvo lugar entre 1964 y 1973: \"No queda un solo edificio anterior al bombardeo de EEUU, las montañas parecen quesos gruyere por el número de agujeros que dejaron los B-52 y la población ha inventado toda una cultura del aprovechamiento del legado de la guerra: las bombas se utilizan para construir alambradas, utensilios de cocina, depósitos de agua o esa prótesis que permite andar a campesinos pobres.\" Un millón de laosianos resultaron muertos durante esta campaña militar.\n" +
                        "\n" +
                        "En 1968 el Pathet Lao (comunista) y el ejército norvietnamita lanzó un ataque de varias divisiones contra el Ejército Real de Laos. El ataque resultó en la amplia desmovilización del ejército y el dejar el conflicto a fuerzas irregulares reunidas por los Estados Unidos y Tailandia. En 1974 se formó una nueva coalición de gobierno donde sólo participaron los partidarios de Suvana Fuma y de Pathet Lao. Pero en 1975, ante la caída de Saigón, Pathet Lao obtuvo más fuerza lo que obligó a los monárquicos a exiliarse en Francia.";
                break;
            case 13:
                newContent = "La actual Macedonia del Norte no se corresponde con la Antigua Macedonia de Alejandro Magno, pues el territorio actual del país no formó parte de aquel reino. Tanto Alejandro Magno como su padre Filipo y el gran filósofo Aristóteles, nacieron y vivieron en territorio griego, la Macedonia histórica, uno de los tantos reinos que conformaban Grecia. El norte de Macedonia geográficamente corresponde aproximadamente al antiguo reino de Peonia, que se ubicó inmediatamente al norte del antiguo reino de Macedonia. Paeonia estaba habitada por los paeonianos, un pueblo tracio, mientras que el noroeste estaba habitado por los dardani y el sudoeste por tribus conocidas históricamente como Enchelae, Pelagones y Lyncestae; los dos últimos se consideran generalmente como tribus del grupo griego del noroeste, mientras que los dos anteriores se consideran ilirios.\n" +
                        "\n" +
                        "A fines del siglo VI a. C., los persas aqueménidas de Darío el Grande conquistaron a los paeonianos, incorporando lo que hoy es el territorio de Macedonia del Norte dentro de sus vastos territorios. Tras la pérdida en la Segunda invasión persa de Grecia en 479 a. C., los persas finalmente se retiraron de sus territorios europeos, incluyendo lo que hoy es el Macedonia del Norte.\n" +
                        "\n" +
                        "Filipo II de Macedonia absorbió las regiones de la Alta Macedonia (Lynkestis y Pelagonia) y la parte sur de Paeonia (Deuriopus) en el reino de Macedonia en 356 a. C. El hijo de Filipo, Alejandro Magno, conquistó el resto de la región incorporándolo a su imperio, llegando al norte hasta Scupi, si bien la ciudad y los alrededores siguieron siendo parte de Dardania.\n" +
                        "\n" +
                        "Los romanos establecieron la provincia de Macedonia en el 146 a. En la época de Diocleciano, la provincia había sido subdividida entre Macedonia Prima (\"primera Macedonia\") en el sur, que abarca la mayor parte del reino de Macedonia, y Macedonia Salutaris (conocida también como Macedonia Secunda, \"segunda Macedonia\") en el norte. , que abarca parcialmente a Dardania y al conjunto de Paeonia; la mayor parte de las fronteras modernas del país se encontraban dentro de este último, con la ciudad de Stobi como su capital. La expansión romana trajo el área de Scupi bajo el dominio romano en la época de Domiciano (81–96 dC), y cayó dentro de la Provincia de Moesia. [60] Si bien el griego siguió siendo el idioma dominante en la parte oriental del imperio romano, el latín se extendió hasta cierto punto en Macedonia.";
                break;
            case 14:
                newContent = "Las primeras ocupaciones humanas registradas se deben a los nama o san. Más tarde diversos grupos provenientes del norte de África se establecieron en el territorio. Los europeos llegaron en número considerable durante la segunda mitad del siglo XV; las costas de Namibia fueron exploradas por el portugués Bartolomeu Dias en 1486, pero la aridez del territorio no estimuló su colonización en ese momento.\n" +
                        "\n" +
                        "La historia reciente de Namibia comenzó en enero de 1793, cuando los neerlandeses reclamaron Walvis Bay. En 1815, con la anexión de la colonia del Cabo de Buena Esperanza neerlandesa por los británicos, el puerto pasa a formar parte de su territorio.\n" +
                        "\n" +
                        "Este importante puerto había sido descubierto en 1487 por Bartolomeu Dias, pero la región no fue reclamada por la corona portuguesa, probablemente por estar abandonada en medio del desierto de Namibia.\n" +
                        "\n" +
                        "En 1840 llegaron los alemanes, quienes tomaron posesión del territorio y lo colonizaron con el nombre de África del Sudoeste Alemana, nombre recién puesto en 1884. El severo régimen colonial conllevó la confiscación y la violencia contra la población autóctona. La sublevación de algunos grupos étnicos fue reprimida brutalmente, ganándose la denominación de primer genocidio del siglo XX. Alemania perdió todas sus colonias tras haber sido derrotada en la Primera Guerra Mundial, por lo que la Sociedad de Naciones legó a Sudáfrica su administración temporal en la forma de mandato, si bien Namibia fue libre una provincia de facto. Años más tarde la ONU y la Corte Internacional de Justicia declararon en numerosas ocasiones ilegal la ocupación sudafricana.\n" +
                        "\n" +
                        "Durante la ocupación sudafricana, se impuso el sistema de segregación racial (apartheid) y se llevaron a cabo movilizaciones forzadas de personas. Enormes granjas fueron asignadas a granjeros de ascendencia europea, mientras que los nativos africanos fueron relegados a los territorios más pobres. En respuesta a esto, se crearon diversas fuerzas opositoras al régimen del apartheid: la más importante fue el SWAPO, que se convertiría a la postre en el representante oficial del pueblo de Namibia en la ONU durante la ocupación sudafricana. Sudáfrica utilizó Namibia para atacar otros países, particularmente Angola, con el fin de impedir que el comunismo se extendiera por el sur del continente.";
                break;
            case 15:
                newContent = "El territorio de Omán aparece mencionado en una tableta grabada en la esfinge en Gizeh, Egipto, hacia el año 1530 a. C. Los geógrafos griegos y latinos (Tolomeo, Plinio) tuvieron noticias de la existencia de esta parte de la península arábiga. A principios del siglo III, un jefe árabe procedente de Hira, en la Mesopotamia, fundó un reino en Omán que mantuvo su independencia hasta la aparición del islam (s. VII). Mascate, que siempre estuvo unida a la historia de Omán, fue un centro importante a partir del siglo VI a. C., cuando los persas sasánidas controlaron el puerto. Los omaníes aceptaron el islam en el mismo siglo VII. Bajo los primeros califas, el país, muy alejado de los centros del poder (bien de La Meca o de Damasco), llevó una existencia política casi independiente, viviendo del comercio con la costa oriental africana. Los omaníes eligieron a su primer imán independiente en el año 751, cuando cayó el califato omeya de Damasco y la sede califal se trasladó a Bagdad. Omán se convirtió en el refugio de los disidentes jariyíes del califato de Bagdad. La rama Ibadí del movimiento jariyí fue la que se impuso en Omán en el siglo XIII. A esta rama perteneció la primera dinastía de imanes.\n" +
                        "\n" +
                        "En 1507 los portugueses fueron los primeros europeos en llegar a Omán, y bajo las órdenes de Alburquerque tomaron la ciudad de Mascate un año después. Los británicos, holandeses e iraníes no tardaron en responder al monopolio portugués, siendo expulsados de Mascate en 1650, y en 1741 el imán Ahmed ben Said (o Abu Said), fundador de la dinastía actual, expulsó a los iraníes, que habían ocupado parte de la costa. Los omaníes se convirtieron a finales del siglo XVIII en una gran potencia naval y comercial en el Índico. Entre 1710 y 1855, años del reinado de Said Sultán, los omaníes dominaron Zanzíbar y parte de la costa oriental africana. La pérdida de Zanzíbar, que se declaró independiente en 1856, y la intervención europea (alemana y británica) en África oriental mermaron el poder de Omán. A finales del siglo XIX, tras una serie de acuerdos, Gran Bretaña instaló en Omán un protectorado, quedando la casa reinante en el trono.\n" +
                        "\n" +
                        "En 1913 la rivalidad entre el imán de Omán y el sultán de Mascate provocó una rebelión en la que las tribus del interior apoyaron al imán. La paz se restableció en 1920 con el tratado de Sib, y duró hasta 1954, cuando el sucesor del imán inició una nueva rebelión esta vez apoyado por Egipto y Arabia Saudí. Sin embargo, con el apoyo de los británicos, los ejércitos del sultán pusieron fin a la rebelión en 1959.\n" +
                        "\n" +
                        "De 1964 a 1976, la región muy pobre de Dhofar fue escenario de un conflicto entre el ejército del sultán y un movimiento rebelde. La rebelión logró avanzar en los primeros años y pronto rodeó la ciudad de Sallah, la principal ciudad de la región. Se celebraron dos congresos para definir los objetivos políticos del movimiento, en 1965 y 1968. Durante el segundo congreso, el Frente de Liberación de Dhofar se convirtió en el Frente Popular para la Liberación de Omán y el Golfo Arábigo. El programa adoptado en estos dos congresos está teñido de comunismo. Su objetivo es establecer una \"república popular democrática\" y expulsar al ejército británico de Omán. El Frente trata de establecer una Constitución, abolir la ley marcial, restablecer la libertad de prensa y de expresión y garantizar los derechos de las minorías. En materia económica, pretende nacionalizar las empresas petroleras, desarrollar industrias e implementar la reforma agraria. Por lo tanto, el Frente pide más justicia social y afirma su apoyo a todos los movimientos de liberación de Asia, África y América Latina. También se hace referencia a la lucha palestina.";
                break;
            case 16:
                newContent = "La historia de Pakistán ―que, para el período que precede a la fundación de la nación en 1947, es compartida intermitentemente por Afganistán, India e Irán― se puede datar hasta los principios de la vida humana en el sur de Asia.\n" +
                        "\n" +
                        "La región actual de Pakistán sirvió como tierra fértil para algunas de las más importantes civilizaciones del sur de Asia y como puerta de entrada del subcontinente a Medio Oriente y Asia Central. Pakistán es hogar de algunos de los más importantes sitios arqueológicos, incluyendo el yacimiento más antiguo de homínidos del Paleolítico en el sur de Asia, ubicado en el valle del río Soan. Situada en la primera ruta de migración costera del anatómicamente moderno homo sapiens al salir de África, la región fue habitada desde temprano por humanos modernos. Los 9000 años de historia de la vida en aldeas en el sur de Asia, se remonta al Neolítico (7000 a. C.-4300 a. C.) encontrándose en el yacimiento de Mehrgarh en Pakistán, y los 5000 años de historia urbana en el sur de Asia en varios sitios del valle del Indo, que incluye Mohenjo-Daro y Harappa.\n" +
                        "\n" +
                        "Los subsecuentes milenios vieron a la región del actual Pakistán absorber muchas influencias, cuyas representaciones se pueden encontrar en el yacimiento de Taksila, representando el período budista, el sitio greco-budista de Takht-i-Bahi, los monumentos islámicos-sindhi de Thatta, pertenecientes al siglo XIV, y los monumentos mogoles construidos en el siglo XVII del fuerte Lahore. Desde el s. XVIII, la región fue gradualmente apropiada por la Compañía Británica de las Indias Orientales, dando como resultado 90 años de continuo dominio británico, y terminando con la creación de Pakistán en 1947, a través de los esfuerzos, de entre otros, su futuro poeta nacional Allama Iqbal y su fundador, Muhammad Ali Jinnah.\n" +
                        "\n" +
                        "Una vez finalizada la Segunda Guerra Mundial se inició el proceso de descolonización en el mundo. El primer país en descolonizarse fue la India, la colonia más importante del Reino Unido, que estableció un trato de independencia con el Reino Unido, apenas después de que Gandhi (líder de uno de los partidos) llamara a la resistencia pasiva de su pueblo, negándose a cooperar con el Imperio Británico. Así pues, el Reino Unido dio la independencia.\n" +
                        "\n" +
                        "La independencia se llevó a cabo en 1948, siguiendo el plan Mountbatten, lo que significaba dividir la India en dos estados en función de las religiones. Los musulmanes quedaron en Pakistán, separados por los hindúes, que se encontraban en la India. Más de 2.000 kilómetros separaban los dos territorios, hasta que en 1971 Pakistán Oriental se convirtió en un nuevo estado: Bangladesh. A día de hoy, se mantiene el conflicto en la región de Cachemira, ya que es un territorio musulmán controlado por la India, pero Pakistán Occidental es reconocida como un estado llamado República Islámica de Pakistán o Pakistán.";
                break;
            case 17:
                newContent = "Los primeros asentamientos por seres humanos anatómicamente modernos en el actual territorio del Reino Unido se produjo en oleadas hace aproximadamente 30 000 años. Se cree que, hacia fines del período prehistórico de la región, la población pertenecía a la cultura de los celta insulares, que comprende a los britanos y a la Irlanda gaélica. La conquista romana, iniciada en el año 43 sometió al sur de la isla a ser una provincia del imperio por cuatro siglos. A esto, le siguió una serie de invasiones encabezadas por distintos pueblos germánicos —anglos, sajones y jutos—, que redujo el área británica hacia lo que iba erigirse como el actual territorio de Gales, Cornualles y el histórico Reino de Strathclyde. La mayor parte de la región colonizada por los anglosajones se unificó en el Reino de Inglaterra en el siglo X. Al mismo tiempo, los gaélico-hablantes en el noroeste de Bretaña —con conexiones hacia el nordeste de Irlanda y tradicionalmente se supone que han migrado desde allí en el siglo V se unieron con los pictos para crear el denominado Reino de Escocia en el siglo IX.\n" +
                        "\n" +
                        "En 1066, los normandos invadieron Inglaterra desde Francia y después de su conquista, tomaron el poder de grandes partes de Gales, Irlanda y fueron invitados a establecerse en Escocia, introduciendo al feudalismo de cada país el modelo norteño-francés y la cultura normanda. La elite normanda influenció en gran medida, pero fue asimilada con cada una de las culturas locales. Subsiguientemente, los reyes medievales ingleses conquistaron Gales y realizaron un intento fallido para anexar a Escocia a su territorio. Tras la Declaración de Arbroath, Escocia mantuvo su estatus soberano, a pesar de las constantes tensiones con Inglaterra. Los monarcas ingleses, debido a la herencia que poseían sobre vastos territorios en Francia y por las reclamaciones a la corona francesa, mantuvieron varios conflictos en Francia, siendo el más notable de ellos la Guerra de los Cien Años. En ella, Escocia se alió con Francia y finalizó en 1453, con la retirada inglesa de tierras francesas.\n" +
                        "\n" +
                        "La Edad Moderna estuvo marcada por conflictos religiosos en torno a la reforma protestante, donde se produjo a partir de allí la introducción de las iglesias protestantes estatales en cada país. Gales fue incorporado totalmente al Reino de Inglaterra, e Irlanda fue constituido como reino en unión personal con la corona inglesa. Dentro del actual territorio norirlandés, las tierras de la nobleza católica gaélica independiente fueron confiscadas y dadas a los colonos protestantes de Inglaterra y Escocia.\n" +
                        "\n" +
                        "En 1603, Jacobo VI de Escocia heredó la corona de Inglaterra e Irlanda, lo cual unió a los tres reinos y se trasladó su corte desde Edimburgo a Londres; no obstante, cada país seguía siendo una entidad política independiente, al mismo tiempo que conservaban sus instituciones políticas, legales y religiosas separadas.";
                break;
            case 18:
                newContent = "La historia de Samoa comenzó cuando inmigrantes de las islas Lau, en el este de Fiyi, llegaron a las islas samoanas aproximadamente hace 3.500 años, y de ahí se establecieron en el resto de Polinesia. El contacto con los europeos comenzó en los primeros años del siglo XVIII, pero no se intensificó hasta la llegada de los comerciantes y misioneros británicos alrededor de 1830.\n" +
                        "\n" +
                        "A través del siglo XIX, el Reino Unido, Alemania y los Estados Unidos reclamaron partes del Reino de Samoa, y establecieron puestos de comercio.\n" +
                        "\n" +
                        "El rey Malietoa Laupepa murió en 1898 y fue sucedido por Malietoa Tooa Mataafa. Los cónsules de Estados Unidos y el Reino Unido apoyaron a Malietoa Tanu, hijo de Laupepa, como nuevo monarca. Buques de guerra norteamericanos y británicos, incluido el USS Philadelphia, bombardearon Apia el 15 de marzo de 1899.\n" +
                        "\n" +
                        "En la Convención Tripartita de Samoa, una comisión conjunta de tres miembros, Bartlett Tripp por los Estados Unidos, C. N. E. Eliot, C.B. por el Reino Unido, y Freiherr Speck von Sternberg por el Imperio Alemán, acordaron dividir las islas. Berlín recibió la parte occidental (posteriormente conocida como Samoa Occidental, hoy en día solo Samoa), que contenía Upolu y Savaii y otras islas adyacentes. Estas islas pasaron a llamarse Samoa Alemana. Los Estados Unidos aceptaron Tutuila y Manu'a, que hoy en día conforman el territorio de Samoa Americana. El Reino Unido renunció a sus aspiraciones en Samoa, a cambio de que los alemanes cedieran sus protectorados en las Islas Salomón septentrionales. La monarquía fue separada del Estado.\n" +
                        "\n" +
                        "Desde 1908, con el establecimiento del movimiento Mau (\"Opinión\"), los samoanos occidentales comenzaron a reclamar la independencia. Poco tiempo después del estallido de la Primera Guerra Mundial, en agosto de 1914, Nueva Zelanda envió una fuerza expedicionaria para tomar y ocupar Samoa Alemana. Aunque el Imperio Alemán rehusó entregar oficialmente las islas, no hubo ninguna resistencia y la ocupación tuvo lugar sin ningún combate. Nueva Zelanda continuó la ocupación de Samoa Occidental a lo largo de la Primera Guerra Mundial. En 1919, bajo el Tratado de Versalles, Alemania abandonó sus reivindicaciones por las islas.";
                break;
            case 19:
                newContent = "Debido a su ubicación geográfica, la cultura thai ha estado tradicionalmente influida por las culturas de China e India. No obstante, Tailandia ha generado diferentes culturas autóctonas desde el período Ban Chiang.\n" +
                        "\n" +
                        "Hace unos 3.000 años lo que actualmente es Tailandia fue ocupado por los pueblos australoasiáticos mon y jemer, hasta que poco antes de nuestra era los tai empezaron su emigración desde el norte (más precisamente desde el montañoso territorio de Yunnan, en China) hacia las llanuras de Indochina, estableciéndose en las cuencas del Mekong y del Me Nam.\n" +
                        "\n" +
                        "Durante el siglo XIII los tai fundaron diversas ciudades-estado y principados, siendo el reino de Sukhothai considerado convencionalmente como el primer Estado tai en la región. Fue fundado en 1238 y su desarrollo coincide en el tiempo con la etapa de debacle y caída del Imperio Jemer, entre los siglos XIII y XV.\n" +
                        "\n" +
                        "Un siglo más tarde, a mediados del XIV, el Reino de Ayutthaya reemplaza a Sukhothai como potencia dominante en Siam. Tras el saqueo de Angkor por Ayutthaya en 1431, gran parte de la corte jemer es obligada a exiliarse a Ayutthaya, trayendo consigo sus rituales y costumbres, de inspiración hindú. Muchas de estas costumbres son asimiladas posteriormente por la cultura de Ayutthaya.\n" +
                        "\n" +
                        "Las potencias europeas comienzan a establecer contactos con Tailandia a partir del siglo XVI. En 1609 los Países Bajos iniciaron relaciones con el Reino de Ayutthaya, poco después los británicos no tardaron en seguir los pasos de los neerlandeses. El rey Narai (1657-1688) cedió el poder de tomar las decisiones comerciales al aventurero griego Constantinos Phaulkon quien decidió conceder el mercado de las especias a Francia, ambas naciones forjaron buenas relaciones llegando incluso a un acuerdo para que el Reino de Ayutthaya enviara embajadores a París, pero cuando las tropas francesas desembarcaron en Bangkok una rebelión popular impidió el acuerdo comercial. Los neerlandeses habían fomentado la rebelión porque se oponían al monopolio de las especias por parte de los franceses. Poco después, los franceses intentaron convertir al rey Narai al cristianismo, pero al morir Narai en 1688 los franceses fueron expulsados y el consejero griego del rey, Constantinos Phaulkon, fue ejecutado.\n" +
                        "\n" +
                        "Tras la caída del Reino de Ayutthaya en 1767, Thonburi se convierte en capital de Tailandia por un periodo breve bajo el mandato del rey Taksin el Grande, hasta el golpe de Estado de 1782.";
                break;
            case 20:
                newContent = "Los asentamientos humanos en el territorio de Ucrania se remontan al 4500 a. C., cuando la cultura neolítica de Cucuteni o de Trypillia floreció en un área que abarcaba partes de la Ucrania moderna y toda la región del Dniéper-Dniéster. En la Edad del Hierro, la tierra fue habitada por cimerios, escitas y sármatas. Entre los años 700 a. C. y 200 a. C., el territorio de Ucrania formó parte del Reino Escita. Desde el siglo VI a. C., se fundaron colonias de la Antigua Grecia, Roma y del Imperio bizantino, tales como Tiras, Olbia y Germonasa, las cuales perduraron hasta el siglo VI d. C.\n" +
                        "\n" +
                        "Según el orador ateniense Demóstenes, Ucrania era el granero de Grecia. Afirmación confirmada por los numerosos silos de trigo que se han encontrado en la región y que atestiguan la importancia del comercio de cereales desde el siglo VI a. C.\n" +
                        "\n" +
                        "Desde el 370 d. C., los godos permanecieron en el área, pero terminaron bajo el dominio de los hunos. En el siglo VII d. C., el territorio este de Ucrania formó parte de la Antigua Gran Bulgaria pero, a finales del siglo, la mayoría de las tribus búlgaras emigraron en direcciones diferentes y la tierra cayó en manos de los jázaros.\n" +
                        "\n" +
                        "En el siglo ix, gran parte del territorio de la Ucrania moderna estaba poblado por los rus', quienes fundaron la Rus de Kiev, la cual abarcaba casi todo el territorio de las actuales Ucrania, Bielorrusia y la Rusia europea. Durante los siglos x y xi, se convirtió en el Estado más grande y poderoso de Europa. En los siglos siguientes, sentó las bases para la identidad nacional de ucranianos, bielorrusos y rusos. Kiev, la capital, se convirtió en la ciudad más importante del Estado. Según la Crónica de Néstor, la élite de la sociedad rus' estuvo formada al principio por varegos procedentes de Escandinavia. Más tarde los varegos fueron asimilados por la población eslava local y formaron parte de la primera dinastía de la Rus, la dinastía Rúrik.La Rus de Kiev estaba formada por varios principados gobernados por los príncipes Rúriks, que estaban relacionados entre sí. El trono de Kiev, el más prestigioso e influyente de todos los principados, se convirtió en objeto de muchas rivalidades entre los Rúrik, como premio más valioso en su búsqueda del poder.\n" +
                        "\n" +
                        "La edad de oro de la Rus de Kiev comenzó con el reinado de Vladímir I de Kiev (980-1015), quien convirtió a los rus' al cristianismo ortodoxo. Durante el reinado de su hijo, Yaroslav I el Sabio (1019-1054), la Rus de Kiev alcanzó el apogeo de su desarrollo cultural y su poder militar. Esto fue seguido por la fragmentación del creciente Estado, ya que la importancia relativa de las potencias regionales aumentó de nuevo. Después de un resurgimiento final bajo el reinado de Vladímir II Monómaco (1113-1125) y su hijo Mstislav I de Kiev (1125-1132), la Rus de Kiev finalmente se desintegró en principados separados tras la muerte de Mstislav.\n" +
                        "\n" +
                        "En los siglos xi y xii, constantes incursiones de las tribus nómadas túrquicas, tales como los pechenegos y los kipchak, motivaron una migración masiva de la población eslava a las regiones más seguras del norte. La invasión mongola del siglo xiii devastó la Rus de Kiev y la ciudad de Kiev fue totalmente destruida en 1240. En el territorio ucraniano, al Estado de la Rus de Kiev lo sucedieron el principado de Galitzia y el principado de Volinia que se fusionaron en el principado de Galitzia-Volynia.";
                break;
            case 21:
                newContent = "Muchas de las islas de Vanuatu están habitadas desde hace miles de años, tras haber sido colonizadas por austronesios pertenecientes a la cultura Lapita alrededor de 2000 a. C. En 1606, el explorador hispano-portugués Pedro Fernández de Quirós se convirtió en el primer europeo en llegar a las islas; creyendo que había llegado a la Terra Australis bautizó el archipiélago con el nombre de Terra Austrialia del Espíritu Santo y fundó una colonia: Nueva Jerusalén en la isla Espíritu Santo. Otras potencias europeas comenzaron a asentarse en las islas a finales del siglo XVIII, primero con las exploraciones del Conde de Bougainville que redescubrió la isla con el nombre de Grandes Cícladas en 1768 y después con el explorador británico James Cook quien, atraído por la luz brillante del volcán Yasur, visitó las islas en su segundo viaje en agosto de 1774, llamándolas Nuevas Hébridas. Allí fundó el Port Resolution, una aldea en la punta este de la isla de Tanna.\n" +
                        "\n" +
                        "En 1887, las Nuevas Hébridas comenzaron a ser administradas por una comisión naval franco-británica. En 1906, se estableció un Condominio Franco-Británico.\n" +
                        "\n" +
                        "Durante la Segunda Guerra Mundial, Estados Unidos utilizó las islas Efaté y Espíritu Santo como bases militares, lo que inyectó divisas al país y sobre todo nuevas formas de pensar, hecho que abrió a Vanuatu el camino a su independencia. En 1957 se estableció un Consejo Asesor. En la década de 1960, los aborígenes vanuatuenses reclamaban el autogobierno y la posterior independencia; en 1974 los nacionalistas ganaron la elección del Parlamento que abolía al Consejo Asesor y en 1978 se creó un gabinete encargado por un Ministro Jefe.\n" +
                        "\n" +
                        "El 24 de marzo de 1974 se proclamó la Nación de Tanna. Mientras los británicos fueron más abiertos a estas demandas, los colonos franceses se opusieron.[cita requerida] Finalmente las autoridades del Condominio Anglo-Francés los reprimieron el 29 de junio de 1974.\n" +
                        "\n" +
                        "En 1979 se promulgó la Constitución que establece parlamentos regionales en las islas de Espíritu Santo y Tanna. Al año siguiente Jimmy Stevens, líder de la agrupación Na-Griamel, organizó una revuelta en Espíritu Santo y proclamó el Estado Independiente de Vemarana. Vanuatu obtiene la independencia plena el 30 de julio de 1980 con Walter Lini como primer ministro; a petición suya, tropas de Papúa Nueva Guinea, Australia y Nueva Zelanda restauraron el orden en Espíritu Santo. En 1981 ingresa en la ONU y en 1983 en el Movimiento de Países no Alineados.";
                break;
            case 22:
                newContent = "Yemen es uno de los centros más antiguos de civilización del Oriente Próximo. Su tierra, relativamente fértil en algunos valles, y su clima húmedo permitieron el desarrollo de una población estable. Sus habitantes, nómadas, se dedicaron durante toda la época antigua al pastoreo y a la cría de aves.\n" +
                        "\n" +
                        "El geógrafo griego Claudio Ptolomeo se refirió a Yemen en sus textos como Eudaimon Arabia (término más conocido por su traducción latina, Arabia Felix). Los pueblos mediterráneos veían llegar caravanas cargadas de incienso, mirra, casia, cinamomo y láudano; o riquezas como oro, ébano, marfil y seda, por lo que dedujeron que se trataba de una tierra de fábula. Su máximo esplendor fue el reino de Saba –capital, Mariaba (Marib)– con su misteriosa reina y su relación amorosa con el rey judío Salomón, que dio origen al mito. La leyenda de Arabia Felix resurgió en el XVII, cuando comerciantes franceses, ingleses y portugueses oyeron hablar de una bebida, el «oro negro» –el café–, que se exportaba al mundo entero a través del puerto yemení de Moka.\n" +
                        "\n" +
                        "Entre el siglo XII a. C. y el siglo VI, la zona fue dominada por tres civilizaciones sucesivas, que controlaron el lucrativo tráfico de especias: los mineos, los sabeos y los himyaritas.\n" +
                        "\n" +
                        "El Reino de Saba, cuya capital era Marib, alcanzó un gran poderío por su situación estratégica, entre la India y el Mediterráneo, lo que le permitió monopolizar el tráfico de especias. De allí era supuestamente originaria la legendaria reina de Saba del Antiguo Testamento. A partir del siglo III d. C., el reino de Saba pasa a ser dominado por la dinastía himyarita, por lo que se habla del Reino de Himyar. En 572 el reino fue anexionado por la Persia sasánida.\n" +
                        "\n" +
                        "El islam llegó a Yemen alrededor del año 630; a partir de entonces, Yemen pasó a formar parte de los califatos árabes, dependiente de Damasco y luego de Bagdad. Durante el siglo VIII comienzan a aparecer en Yemen pequeños estados independientes, como la dinastía zaidí o zaidita, a la que seguirán otras. En los siglos posteriores Yemen oscila entre la independencia y la sumisión primero a los califas de Egipto y luego a los sultanes del Imperio otomano. A partir del siglo XV, interviene Portugal, quien se apodera del puerto de Adén durante unos veinte años y mantuvo durante este periodo un enclave fortificado en la isla de Socotra.\n" +
                        "\n" +
                        "En el Siglo XVIII, Ibn Saud, fundador de la dinastía saudita, anexiona Yemen, que luego vuelve, tras un breve período de independencia, al dominio egipcio, en la primera mitad del siglo XIX. Los británicos se instalan en Adén en 1839, y pasan a ser un poder decisivo en la zona.";
                break;
            default:
                newContent = "El territorio actual de Zambia fue originalmente poblado por tribus khoisan de cazadores-recolectores, que fueron desplazados hace unos dos mil años por pueblos migratorios, más avanzados tecnológicamente. Asimismo, a partir del siglo XII, comienza la gran migración bantú que habría de poblar gran parte del continente.\n" +
                        "\n" +
                        "Entre esos pueblos se encontraban los tonga (también llamados batonga) que fueron los primeros en establecerse en Zambia. Los nkoya probablemente llegaron incluso antes, estableciéndose en el territorio desde los reinados Luba-Lunda del norte.\n" +
                        "\n" +
                        "Otros grupos siguieron llegando, con un gran influjo entre los siglos XVII y XIX. Esta inmigración procedía de los Luba y Lunda originarios de la actual República Democrática del Congo y el norte de Angola. A lo largo del siglo XIX llegaron los nguni desde el sur, como consecuencia del Mfecane.\n" +
                        "\n" +
                        "Visitada por los portugueses en el siglo XVIII, la actual Zambia fue explorada por el británico David Livingstone. La penetración colonial se inició en 1890, por medio de la British South Africa Company. Su gran artífice fue Cecil Rhodes, presidente de la British South African Company, que se dedicó a explotar los minerales de la zona y cuyo apellido daba nombre a dos países: Rhodesia del Norte y Rhodesia del Sur (actualmente Zimbabue y Zambia).\n" +
                        "\n" +
                        "La antigua Rodesia del Norte, en 1953 el Reino Unido intentó unirla a Rodesia del Sur (actual Zimbabue) y Malaui, pero los intereses de los colonos blancos de Rodesia del Sur hicieron que en 1964 Rodesia del Norte se separase, formando el nuevo Estado de Zambia. En 1964 Kenneth Kaunda fue elegido como primer (y único) primer ministro de Rhodesia del Norte.\n" +
                        "\n" +
                        "En 1973 el país cerró las fronteras con Zimbabue, en protesta contra el régimen racista de Ian Smith. En 1979, comandos de Rodesia destruyeron en Lusaka el cuartel general del movimiento guerrillero Unión Africana del Pueblo de ZimbabUe (ZAPU), que combatía el régimen blanco rodesiano con el apoyo del gobierno de Zambia. En 1982, las medidas de austeridad económica llevaron a una huelga general contra Kaunda. La crisis se agravó con el bajón internacional del precio del cobre.\n" +
                        "\n" +
                        "Kaunda fue reelecto varias veces, quedándose en la presidencia hasta 1991, año en el que es reemplazado por Frederick Chiluba. Entre diversas acusaciones de malversación de fondos y otros casos de corrupción de su administración, Chiluba dimitió al cargo en enero de 2002, siendo sucedido por su vicepresidente Levy Patrick Mwanawasa, quien inicia una campaña anticorrupción en su país, pero fallece el 19 de agosto de 2008. Mwanawasa es reemplazado por Rupiah Banda (quien era el vicepresidente al momento de su muerte). Banda ejerció el cargo desde noviembre de 2008 hasta septiembre de 2011, siendo reemplazado en el poder por Michael Sata, quien fue apodado \"El Rey Cobra\" (King Cobra) durante su candidatura. Tras su repentina muerte, ocurrida el 28 de octubre de 2014, Sata es sucedido de forma interina por el vicepresidente Guy Scott, el primer presidente blanco del África subsahariana desde el régimen de apartheid. En 2015 accedió a la presidencia Edgar Chagwa Lungu.";
                break;
        }

        return newContent;

    }

    /**
     * A countries item representing a piece of content.
     */
    public static class CountryItem {
        public final String id;
        public final String content;
        public final String details;

        public CountryItem(String id,String content,String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
