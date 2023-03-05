import garaje.src.Client;
import garaje.src.Coche;
import garaje.src.Garaje;
import garaje.src.Moto;
import mundial.src.Group;
import mundial.src.Keys;
import mundial.src.Team;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Team> teamsGroupA = new ArrayList<Team>();
        teamsGroupA.add(new Team("River Plate"));
        teamsGroupA.add(new Team("Boca Juniors"));
        teamsGroupA.add(new Team("Independiente"));
        teamsGroupA.add(new Team("Racing Club"));

        ArrayList<Team> teamsGroupB = new ArrayList<Team>();
        teamsGroupB.add(new Team("San Lorenzo"));
        teamsGroupB.add(new Team("Huracán"));
        teamsGroupB.add(new Team("Vélez Sarsfield"));
        teamsGroupB.add(new Team("Argentinos Juniors"));

        ArrayList<Team> teamsGroupC = new ArrayList<Team>();
        teamsGroupC.add(new Team("Newell's Old Boys"));
        teamsGroupC.add(new Team("Rosario Central"));
        teamsGroupC.add(new Team("Central Córdoba"));
        teamsGroupC.add(new Team("Talleres de Córdoba"));

        ArrayList<Team> teamsGroupD = new ArrayList<Team>();
        teamsGroupD.add(new Team("Estudiantes"));
        teamsGroupD.add(new Team("Gimnasia y Esgrima"));
        teamsGroupD.add(new Team("Defensa y Justicia"));
        teamsGroupD.add(new Team("Lanús"));

        ArrayList<Team> teamsGroupE = new ArrayList<Team>();
        teamsGroupE.add(new Team("Banfield"));
        teamsGroupE.add(new Team("Arsenal"));
        teamsGroupE.add(new Team("Godoy Cruz"));
        teamsGroupE.add(new Team("Atlético Tucumán"));

        ArrayList<Team> teamsGroupF = new ArrayList<Team>();
        teamsGroupF.add(new Team("Unión de Santa Fe"));
        teamsGroupF.add(new Team("Colón"));
        teamsGroupF.add(new Team("Patronato"));
        teamsGroupF.add(new Team("Sarmiento de Junín"));

        ArrayList<Team> teamsGroupG = new ArrayList<Team>();
        teamsGroupG.add(new Team("San Martín de Tucumán"));
        teamsGroupG.add(new Team("Atlético Rafaela"));
        teamsGroupG.add(new Team("Belgrano"));
        teamsGroupG.add(new Team("Instituto"));

        ArrayList<Team> teamsGroupH = new ArrayList<Team>();
        teamsGroupH.add(new Team("Quilmes"));
        teamsGroupH.add(new Team("Temperley"));
        teamsGroupH.add(new Team("Brown de Adrogué"));
        teamsGroupH.add(new Team("Platense"));

        Group groupA = new Group();
        groupA.generateMatch(teamsGroupA);
        groupA.getMatchList().get(0).makeGoal();
        groupA.getMatchList().get(1).makeGoal();
        groupA.getMatchList().get(2).makeGoal();
        groupA.getMatchList().get(3).makeGoal();
        groupA.getMatchList().get(4).makeGoal();
        groupA.getMatchList().get(5).makeGoal();

        Group groupB = new Group();
        groupB.generateMatch(teamsGroupB);
        groupB.getMatchList().get(0).makeGoal();
        groupB.getMatchList().get(1).makeGoal();
        groupB.getMatchList().get(2).makeGoal();
        groupB.getMatchList().get(3).makeGoal();
        groupB.getMatchList().get(4).makeGoal();
        groupB.getMatchList().get(5).makeGoal();

        Group groupC = new Group();
        groupC.generateMatch(teamsGroupC);
        groupC.getMatchList().get(0).makeGoal();
        groupC.getMatchList().get(1).makeGoal();
        groupC.getMatchList().get(2).makeGoal();
        groupC.getMatchList().get(3).makeGoal();
        groupC.getMatchList().get(4).makeGoal();
        groupC.getMatchList().get(5).makeGoal();

        Group groupD = new Group();
        groupD.generateMatch(teamsGroupD);
        groupD.getMatchList().get(0).makeGoal();
        groupD.getMatchList().get(1).makeGoal();
        groupD.getMatchList().get(2).makeGoal();
        groupD.getMatchList().get(3).makeGoal();
        groupD.getMatchList().get(4).makeGoal();
        groupD.getMatchList().get(5).makeGoal();

        Group groupE = new Group();
        groupE.generateMatch(teamsGroupE);
        groupE.getMatchList().get(0).makeGoal();
        groupE.getMatchList().get(1).makeGoal();
        groupE.getMatchList().get(2).makeGoal();
        groupE.getMatchList().get(3).makeGoal();
        groupE.getMatchList().get(4).makeGoal();
        groupE.getMatchList().get(5).makeGoal();

        Group groupF = new Group();
        groupF.generateMatch(teamsGroupF);
        groupF.getMatchList().get(0).makeGoal();
        groupF.getMatchList().get(1).makeGoal();
        groupF.getMatchList().get(2).makeGoal();
        groupF.getMatchList().get(3).makeGoal();
        groupF.getMatchList().get(4).makeGoal();
        groupF.getMatchList().get(5).makeGoal();

        Group groupG = new Group();
        groupG.generateMatch(teamsGroupG);
        groupG.getMatchList().get(0).makeGoal();
        groupG.getMatchList().get(1).makeGoal();
        groupG.getMatchList().get(2).makeGoal();
        groupG.getMatchList().get(3).makeGoal();
        groupG.getMatchList().get(4).makeGoal();
        groupG.getMatchList().get(5).makeGoal();

        Group groupH = new Group();
        groupH.generateMatch(teamsGroupH);
        groupH.getMatchList().get(0).makeGoal();
        groupH.getMatchList().get(1).makeGoal();
        groupH.getMatchList().get(2).makeGoal();
        groupH.getMatchList().get(3).makeGoal();
        groupH.getMatchList().get(4).makeGoal();
        groupH.getMatchList().get(5).makeGoal();

        // mostrar los equipos que avanzan en cada grupo
        System.out.println("\nEquipos clasificados a octavos:");
        System.out.println("Grupo A: " + groupA.getNextStageTeams().get(0).getTeamName());
        System.out.println("Grupo B: " + groupB.getNextStageTeams().get(0).getTeamName());
        System.out.println("Grupo C: " + groupC.getNextStageTeams().get(0).getTeamName());
        System.out.println("Grupo D: " + groupD.getNextStageTeams().get(0).getTeamName());
        System.out.println("Grupo E: " + groupE.getNextStageTeams().get(0).getTeamName());
        System.out.println("Grupo F: " + groupF.getNextStageTeams().get(0).getTeamName());
        System.out.println("Grupo G: " + groupG.getNextStageTeams().get(0).getTeamName());
        System.out.println("Grupo H: " + groupH.getNextStageTeams().get(0).getTeamName());


        ArrayList<Team> eightsClassified = new ArrayList<Team>();
        eightsClassified.addAll(groupA.getNextStageTeams());
        eightsClassified.addAll(groupB.getNextStageTeams());
        eightsClassified.addAll(groupC.getNextStageTeams());
        eightsClassified.addAll(groupD.getNextStageTeams());
        eightsClassified.addAll(groupE.getNextStageTeams());
        eightsClassified.addAll(groupF.getNextStageTeams());
        eightsClassified.addAll(groupG.getNextStageTeams());
        eightsClassified.addAll(groupH.getNextStageTeams());

        Keys eights = new Keys();

        eights.generateMatches(eightsClassified);
        eights.getMatchList().get(0).makeGoal();
        eights.getMatchList().get(1).makeGoal();
        eights.getMatchList().get(2).makeGoal();
        eights.getMatchList().get(3).makeGoal();
        eights.getMatchList().get(4).makeGoal();
        eights.getMatchList().get(5).makeGoal();
        eights.getMatchList().get(6).makeGoal();
        eights.getMatchList().get(7).makeGoal();

        ArrayList<Team> quartersClassified = eights.getNextStageTeams();

        Keys quarters = new Keys();

        quarters.generateMatches(quartersClassified);
        quarters.getMatchList().get(0).makeGoal();
        quarters.getMatchList().get(1).makeGoal();
        quarters.getMatchList().get(2).makeGoal();
        quarters.getMatchList().get(3).makeGoal();

        ArrayList<Team> semiClassified = quarters.getNextStageTeams();

        // Imprimir los resultados de los cuartos de final
        System.out.println("\nClasificados a cuartos de final:");
        System.out.println("Equipo: " + quarters.getNextStageTeams().get(0).getTeamName());
        System.out.println("Equipo: " + quarters.getNextStageTeams().get(1).getTeamName());
        System.out.println("Equipo: " + quarters.getNextStageTeams().get(2).getTeamName());
        System.out.println("Equipo: " + quarters.getNextStageTeams().get(3).getTeamName());

        Keys semi = new Keys();
        semi.generateMatches(semiClassified);
        semi.getMatchList().get(0).makeGoal();
        semi.getMatchList().get(1).makeGoal();

        ArrayList<Team> finalist = semi.getNextStageTeams();

        // Imprimir los resultados de las semifinales
        System.out.println("\nClasificados a semifinales:");
        System.out.println("Equipo: " + semi.getNextStageTeams().get(0).getTeamName());
        System.out.println("Equipo: " + semi.getNextStageTeams().get(1).getTeamName());

        Keys finalissima = new Keys();
        finalissima.generateMatches(finalist);
        finalissima.getMatchList().get(0).makeGoal();

        ArrayList<Team>winner=finalissima.getNextStageTeams();

        System.out.println(String.format("______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "¶¶¶¶______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_______¶¶¶¶ \n" +
                "¶¶¶_______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________¶¶¶ \n" +
                "¶¶________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________¶¶¶ \n" +
                "¶¶¶_____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶______¶¶¶ \n" +
                "¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____¶¶¶¶ \n" +
                "_¶¶¶___¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶____¶¶¶ \n" +
                "_¶¶¶¶___¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶¶__¶¶¶¶ \n" +
                "___¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶¶¶ \n" +
                "____¶¶¶¶¶¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶¶¶¶¶¶¶ \n" +
                "______¶¶¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶ \n" +
                "_______________¶¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "_________________¶¶¶¶¶¶¶¶ \n" +
                "___________________¶¶¶¶ \n" +
                "___________________¶¶¶¶ \n" +
                "___________________¶¶¶¶ \n" +
                "___________________¶¶¶¶ \n" +
                "_______________¶¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "____________¶¶¶"+"  GANADOR  ¶¶¶ \n" +
                "____________¶¶¶"+winner.get(0).getTeamName()+"¶¶¶ \n" +
                "____________¶¶¶____________¶¶¶ \n" +
                "____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "__________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "_________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n"));
        Client cliente = new Client("Matias", "AF005333", "River Plate");
        if (cliente.getExpectedResult() == winner.get(0).getTeamName()){
            cliente.addPoints();
            System.out.println("Ganaste, tus puntos son: " + cliente.getPoints());
        } else {
            System.out.println("No sumaste puntos :(");
        }
        Garaje garaje = new Garaje(50, 5);
        garaje.ingresarVehiculo(new Coche("Ford", 20000, 4));
        garaje.ingresarVehiculo(new Coche("BMW", 15000, 2));
        garaje.ingresarVehiculo(new Moto("Yamaha", 10000, 600));
        garaje.ingresarVehiculo(new Moto("Honda", 8000, 750));

        System.out.println("\n\n\n\n\n____//_]|________         ____//__][__][___|     ____//__][______||\n" +
                "(o _ |  -|   _  o|        (o  _|  -|     _ o|    (o _ |  -|   _   o|\n" +
                " `(_)-------(_)--'         `-(_)--------(_)-'     `(_)-------(_)---'");
        garaje.imprimirInformacionGaraje();
        garaje.imprimirInformacionVehiculos();
        System.out.println("(|\n" +
                "                                                   ||_    \n" +
                "                                                  =///`\\   \n" +
                "                             (\\                   \\\\\\) | \n" +
                "                            __\\\\                   `|~~|    \n" +
                "                           (((<_|            ____   |  |     \n" +
                "                            `-__/\\         /~    ~\\|   |    \n" +
                "                               \\  ~-_     |--|     |___|    \n" +
                "                                `\\   ~-_  |_/     /--__/   \n" +
                "                                  `\\/ / ~-_\\___--/    /   \n" +
                "                                    `-_    ~/   /    /   \n" +
                "                                       ~-_ /   |   _/   \n" +
                "                                          |         |\n" +
                "                                         |~~~~~-----| \n" +
                "                                         |___----~~~/\n" +
                "              _-~~\\                       \\_       /\n" +
                "            /(_|_-~                       |       /                          \n" +
                "          /   /~==[]\\     ____-------_    |_____--|   ______________       \n" +
                "        /    (_ //(\\0)~~~~    YAMAHA  ~\\ /_-       \\/'         ___/ ~~~~/  \n" +
                "       (|      ~~--__                   |/         )_____---~~~    YZF  \\    \n" +
                "        \\.      ___  ~~--__ ____        /        _-/              __--~~'  \n" +
                "          ~\\    \\\\\\\\       ~~-_ ~-____ /      _-~~          __--~~___ \n" +
                "     _ ----/ \\    \\\\\\\\         ~-_    /---__-~        __--~~----~~_  ]=\n" +
                "  _-~ ___ / /__\\   ~~~            ~-_ ( )-~ ~-_~~~/~~~ _-~         ~-_ \n" +
                " /-~~~_-|/ /    ~\\                  _) ~-_     \\ /~~~~~---__-----_    \\\n" +
                ";    / \\/_//`\\    \\           __--~~/_   \\~-_ _-\\ ~~~~~~~~~~~~-/_/\\    .\n" +
                "|   | \\((*))/ |   |\\    __--~~     /o \\   `\\ ~-  `\\----_____( 0) ) |   | \n" +
                "|    \\  |~|  /    | )-~~           \\ 0 )    |/' _-~/~--------| |~ /    ,\n" +
                " \\    ~-----~    / /                ~~~~~~~~/_/O_/'   \\    ~-----~    /\n" +
                "  ~-_         _-~ `---------------------------'        `-_         _-~\n" +
                "     ~ ----- ~                                            ~ ----- ~  -TX");
    }
}