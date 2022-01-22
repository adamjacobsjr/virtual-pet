package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        VirtualPet rapter = new VirtualPet(50, 50, 50);


        System.out.println("Welcome to Jurassic Park adopt a Rapter program.");
        System.out.println();
        System.out.println("                                                     ___._");
        System.out.println("                                                   .'  <0>'-.._");
        System.out.println("                                                  /  /.--.____')");
        System.out.println("                                                 |   :   __.-'~");
        System.out.println("                                                 |  :  -'/");
        System.out.println("                                                /:.  :.-'");
        System.out.println("__________                                     | : '. |");
        System.out.println("'--.____  '--------.______       _.----.-----./      :/");
        System.out.println("        '--.__            `'----/       '-.      __ :/");
        System.out.println("              '-.___           :           :   .'  )/");
        System.out.println("                    '---._           _.-'   ] /  _/");
        System.out.println("                         '-._      _/     _/ / _/");
        System.out.println("                             :_ .-'____.-'__< |  \"___");
        System.out.println("                               <_______.:    :_:_---.7");
        System.out.println("                              |   /'=r_.-'     _\\ =/");
        System.out.println("                          .--'   /            ._/'>");
        System.out.println("                        .'   _.-'");
        System.out.println("                       / .--'");
        System.out.println("                      /,/");
        System.out.println("                      |/`)");
        System.out.println("                      'c=,");
        System.out.println();
        System.out.println();
        System.out.println("Let's give your pet Rapter a name");

        String name = input.nextLine();
        System.out.println();
        System.out.println(name + " sounds like a perfect name!");

        String select;

        do {

            System.out.println();
            System.out.println(name + "'s hunger is at " + rapter.getHungerLevel());
            System.out.println(name + "'s thirst is at " + rapter.getThirstLevel());
            System.out.println(name + "'s happiness is at " + rapter.getHappyLevel());
            System.out.println();
            System.out.println("What would you like to do? ");
            System.out.println();
            System.out.println("[0] Exit");
            System.out.println("[1] Feed " + name);
            System.out.println("[2] Water " + name);
            System.out.println("[3] Play " + name);
            System.out.println();

            select = input.nextLine();

            if (select.equals("1")) {
                System.out.println("You give " + name + " a large haunch of meat");
                rapter.giveFood();
            }

            if (select.equals("2")) {
                System.out.println("You refill " + name + "'s water tank");
                rapter.giveWater();
            }

            if (select.equals("3")) {
                System.out.println("What would you like to play with " + name);
                System.out.println("[0] Exit");
                System.out.println("[a] Fetch ");
                System.out.println("[b] hide and seek ");
                System.out.println("[c] rock, paper, scissors ");

                String game = input.nextLine();

                if (game.equals("a")) {
                    System.out.println("You toss a ball into the rapter enclosure " + name + " looks at you confused. Turns and runs into the forest of the enclosure." + name + " Does not return.");
                    rapter.play();
                }

                if (game.equals("b")) {
                    System.out.println("You step into the enclosure and " + name + " pounces upon you immediately. " + name + " looks satisfied as they devour you.");
                    rapter.play();
                    System.out.println(name + "'s happiness has increased. Thanks for playing!");
                    System.exit(0);
                }
                if (game.equals("c")) {
                    System.out.println("You reach your hand in to the enclosure and pound your first in the air 3 times counting " + name + " watches this gesture wildly confused. " + name + " lunges forward and bites your hand off.");
                    rapter.play();
                    System.out.println(name + "'s happiness has increased. Your happiness decreases dramatically. Thanks for playing!");
                    System.exit(0);
                }

            }

            rapter.tick();


        }
        while (!select.equals("0"));
        System.out.println("Thanks for playing!");

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$**''''`` ````'''#*R$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$*''      ..........      `'#$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$#`    .ue@$$$********$$$$Weu.   ``*$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$#''   ue$$*#''               `'**$$N.  *R$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$P    u@$**`                          #$$o.  ^*$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$P  .o$R``               . .WN.           #$Nu  '#$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$`  .@$#`       'ou  .oeW$$$$$$$$W           `$$u  '$$$$$$$$$$$$");
        System.out.println("$$$$$$$$#   o$#`      ueL  $$$$$$$$$$$$$$$$ku.           $$u  $$$$$$$$$$$");
        System.out.println("$$$$$$$  x$P`        `$$u$$$$$$$$$$$$$$#####$$$L            $o  #*$$$$$$$");
        System.out.println("$$$$$$  d$        #$u.2$$$$$$$$$$$$$$$$  #$$$Nu#$            $$.  #$$$$$$");
        System.out.println("$$$$$  @$          $$$$$$$$$$$$$$$$$$$$k  $#$$#*$$u           #$L  #$$$$$");
        System.out.println("$$$$  d$         #Nu@$$$$$$$$$$$$$$$$$$   $x$$L #$$$o.         #$c  #$$$$");
        System.out.println("$$$F  d$          .$$$$$$$$$$$$$$$$$$$$N  $d$$$$  $$$$$u        #$L  #$$$");
        System.out.println("$$$  :$F        ..`$$$$$$$$$$$$$$$$$$$$$$$$$$$`    R$$$$$eu.     $$   $$$");
        System.out.println("$$!  $$        . R$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.   @$$$$$$$$Nu   '$N  `$$");
        System.out.println("$$  x$`        Re$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$uu@````$$$$$$$i   #$:  $$");
        System.out.println("$E  $$       c 8$$$$$$$$$$$$$$$$$$$$$G(   ``^*$$$$$$$WW$$$$$$$$N   $$  4$");
        System.out.println("$~ :$$N. tL i)$$$$$$$$$$$$$$$$$$$$$$$$$N       ^#R$$$$$$$$$$$$$$$   9$ '$");
        System.out.println("$  t$$$$u$$W$$$$$$$$$$$$$$!$$$$$$$$$$$$$&       . c?'*$$$R$$$$$$$  '$k  $");
        System.out.println("$  $$$$$$$$$$$$$$$$$$$$$'E F#$$$$$$$$$$.#        +.V#;*#x#.##*$$$   $B  $");
        System.out.println("$  $$$$$$$$$$$$$$$$`$)#F     $$$$$$$$$$$           `  -d>x`*=.``    $$  $");
        System.out.println("$  $$$$$$$$$$?$$R'$ `#d$``    #$$$$$$$$$ > .                '       $$  $");
        System.out.println("$  $$$$$$$($$@$'` P *@$.@#'!    '*$$$$$$$L!.                        $$  $");
        System.out.println("$  9$$$$$$$L#$L  ! * <$$`          **$$$$$NL:'z  f                  $E  $");
        System.out.println("$> ?$$$$ $$$b$^      .$c .ueu.        `#$$$$b'x'# ''                x$  $");
        System.out.println("$k  $$$$N$  $$L:$oud$$$` d$ .u.         #$$$$$o.'' #f.              $$  $");
        System.out.println("$$  R$''$$o.$'$$$$'''' ue$$$P'''c          '$$$$$$Wo'              :$F  $");
        System.out.println("$$: '$&  $*$$u$$$$u.ud$R  `    ^            `#*****                @$  $$");
        System.out.println("$$N  #$: E 3$$$$$$$$$                                             d$  x$$");
        System.out.println("$$$k  $$   F *$$$$*                                             :$P   $$$");
        System.out.println("$$$$  '$b                                                      .$P   $$$$");
        System.out.println("$$$$b  `$b                                                    .$$   @$$$$");
        System.out.println("$$$$$N  `$N                                                  .$P   @$$$$$");
        System.out.println("$$$$$$$$.  $N.                                            .@$    $$$$$$$$");
        System.out.println("$$$$$$$$$o   #$N.                                       .@$#  .@$$$$$$$$$");
        System.out.println("$$$$$$$$$$$u  `#$Nu                                   u@$#   u$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$u   `R$o.                             ue$R    u$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$o.  ^#$$bu.                     .uW$P`   .u$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$u   ``#R$$Wou..... ....uueW$$*#`   .u@$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$Nu.    ``##***$$$$$***##``    .o$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$eu..               ...ed$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$NWWeeeeedW@$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        System.exit(0);

        input.close();

    }







}