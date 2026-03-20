package fr.ensai.mediaplayer;

public class Main {
    public static void main(String[] args){
        Artist stromae = new Artist("Paul", "Van Haver", "Belge");
        Artist author = new Artist("Aut", "Hor", "Français");
        Artist composer = new Artist("Comp", "Oser", "Français");
        MusicalGenres[] listPapaoutai = {MusicalGenres.POP, MusicalGenres.ROCK};
        Song papaoutai = new Song("Papaoutai", stromae, 2013, 232, "Dites-moi d'où il vient\n" + //
                        "Enfin je saurai où je vais\n" + //
                        "Maman dit que lorsqu'on cherche bien\n" + //
                        "On finit toujours par trouver\n" + //
                        "Elle dit qu'il n'est jamais très loin\n" + //
                        "Qu'il part très souvent travailler\n" + //
                        "Maman dit, \"Travailler, c'est bien\"\n" + //
                        "Bien mieux qu'être mal accompagné\n" + //
                        "Pas vrai?\n" + //
                        "Où est ton papa?\n" + //
                        "Dis-moi, où est ton papa?\n" + //
                        "Sans même devoir lui parler\n" + //
                        "Il sait ce qui ne va pas\n" + //
                        "Ah, sacré papa\n" + //
                        "Dis-moi, où es-tu caché?\n" + //
                        "Ça doit faire au moins mille fois que j'ai\n" + //
                        "Compté mes doigts\n" + //
                        "Hey\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, où t'es où, papaoutai?\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, où t'es où, papaoutai?\n" + //
                        "Quoi? Qu'on y croie ou pas\n" + //
                        "Y aura bien un jour où on n'y croira plus\n" + //
                        "Un jour ou l'autre, on sera tous papas\n" + //
                        "Et d'un jour à l'autre, on aura disparu\n" + //
                        "Serons-nous détestables?\n" + //
                        "Serons-nous admirables?\n" + //
                        "Des géniteurs ou des génies?\n" + //
                        "Dites-nous qui donne naissance aux irresponsables?\n" + //
                        "Ah, dites-nous qui?\n" + //
                        "Tiens, tout le monde sait comment on fait des bébés\n" + //
                        "Mais personne sait comment on fait des papas\n" + //
                        "Monsieur je-sais-tout en aurait hérité, c'est ça\n" + //
                        "Faut l'sucer d'son pouce ou quoi?\n" + //
                        "Dites-nous où c'est caché, ça doit\n" + //
                        "Faire au moins mille fois qu'on a\n" + //
                        "Bouffé nos doigts\n" + //
                        "Hey\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, où t'es où, papaoutai?\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, où t'es où, papaoutai?\n" + //
                        "Où est ton papa?\n" + //
                        "Dis-moi, où est ton papa?\n" + //
                        "Sans même devoir lui parler\n" + //
                        "Il sait ce qui ne va pas\n" + //
                        "Ah, sacré papa\n" + //
                        "Dis-moi, où es-tu caché?\n" + //
                        "Ça doit faire au moins mille fois que j'ai\n" + //
                        "Compté mes doigts\n" + //
                        "Hey\n" + //
                        "Où est ton papa?\n" + //
                        "Dis-moi, où est ton papa?\n" + //
                        "Sans même devoir lui parler\n" + //
                        "Il sait ce qui ne va pas\n" + //
                        "Ah, sacré papa\n" + //
                        "Dis-moi, où es-tu caché?\n" + //
                        "Ça doit faire au moins mille fois que j'ai\n" + //
                        "Compté mes doigts\n" + //
                        "Hey\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, où t'es où, papaoutai?\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, papaoutai?\n" + //
                        "Où t'es, où t'es où, papaoutai?", author, composer, listPapaoutai);
        papaoutai.play();
}

}
