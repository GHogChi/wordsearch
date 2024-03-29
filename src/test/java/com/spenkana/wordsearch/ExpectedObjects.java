package com.spenkana.wordsearch;

import com.spenkana.wordsearch.nucleus.Puzzle;

import static com.spenkana.wordsearch.nucleus.Puzzle.newPuzzle;

public abstract class ExpectedObjects {
    public static final String wordsExpectedInExample =
            "BONES,KHAN,KIRK,SCOTTY,SPOCK,SULU,UHURA";

    public static final String[] wordsExpectedInExampleAsArray = new String[]{
            "BONES", "KHAN", "KIRK", "SCOTTY", "SPOCK", "SULU", "UHURA"
    };

    public static final Puzzle ExamplePuzzle = newPuzzle(
            "UMKHULKINVJOCWE",
            "LLSHKZZWZCGJUYG",
            "HSUPJPRJDHSBXTG",
            "BRJSOEQETIKKGLE",
            "AYOAGCIRDQHRTCD",
            "SCOTTYKZREPPXPF",
            "BLQSLNEEEVULFMZ",
            "OKRIKAMMRMFBAPP",
            "NUIIYHQMEMQRYFS",
            "EYZYGKQJPCQWYAK",
            "SJFZMQIBDBEMKWD",
            "TGLBHCBECHTOYIK",
            "OJYEULNCCLYBZUH",
            "WZMISUKURBIDUXS",
            "KYLBQQPMDFCKEAB"
    ).output;

    public static final String[] expectedSolution = new String[]{
            "BONES: (0,6),(0,7),(0,8),(0,9),(0,10)",
            "KHAN: (5,9),(5,8),(5,7),(5,6)",
            "KIRK: (4,7),(3,7),(2,7),(1,7)",
            "SCOTTY: (0,5),(1,5),(2,5),(3,5),(4,5),(5,5)",
            "SPOCK: (2,1),(3,2),(4,3),(5,4),(6,5)",
            "SULU: (3,3),(2,2),(1,1),(0,0)",
            "UHURA: (4,0),(3,1),(2,2),(1,3),(0,4)"
    };
}
