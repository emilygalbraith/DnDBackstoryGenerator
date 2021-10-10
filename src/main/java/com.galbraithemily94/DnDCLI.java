package com.galbraithemily94;

import com.galbraithemily94.View.Menu;

public class DnDCLI {
    //create enums for menus
    private static final String MAIN_MENU_OPTION_CREATE_NEW_CHARACTER = "Create a new character backstory";
    private static final String MAIN_MENU_OPTION_GENERATE_SHEET = "Generate a character sheet for your current character";
    private static final String MAIN_MENU_OPTION_EXIT = "Exit";
    private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_CREATE_NEW_CHARACTER, MAIN_MENU_OPTION_GENERATE_SHEET, MAIN_MENU_OPTION_EXIT };
    private static final String BACKSTORY_GENERATOR_MENU_RANDOM_BACKSTORY = "Completely random backstory";
    private static final String BACKSTORY_GENERATOR_MENU_CHOOSE_NAME = "Choose a name";
    private static final String BACKSTORY_GENERATOR_MENU_CHOOSE_AGE = "Choose an age";
    private static final String BACKSTORY_GENERATOR_MENU_CHOOSE_GENDER = "Choose a gender";
    private static final String BACKSTORY_GENERATOR_MENU_CHOOSE_RACE = "Choose a race";
    private static final String BACKSTORY_GENERATOR_MENU_CHOOSE_CLASS = "Choose a class";
    private static final String BACKSTORY_GENERATOR_MENU_CHOOSE_BACKGROUND = "Choose a background";
    private static final String BACKSTORY_GENERATOR_MENU_CREATE_BACKSTORY = "Create backstory";
    private static final String[] BACKSTORY_GENERATOR_MENU = { BACKSTORY_GENERATOR_MENU_RANDOM_BACKSTORY, BACKSTORY_GENERATOR_MENU_CHOOSE_NAME, BACKSTORY_GENERATOR_MENU_CHOOSE_AGE, BACKSTORY_GENERATOR_MENU_CHOOSE_GENDER, BACKSTORY_GENERATOR_MENU_CHOOSE_RACE, BACKSTORY_GENERATOR_MENU_CHOOSE_CLASS, BACKSTORY_GENERATOR_MENU_CHOOSE_BACKGROUND, BACKSTORY_GENERATOR_MENU_CREATE_BACKSTORY };
    private static final String RACE_MENU_CHOOSE_SUBTYPE = "Choose a race subtype";
    private static final String RACE_MENU_RETURN_TO_GENERATOR_MENU = "Return to generator menu";
    private static final String[] RACE_MENU_OPTIONS = {RACE_MENU_CHOOSE_SUBTYPE, RACE_MENU_RETURN_TO_GENERATOR_MENU};
    private static final String AGE_RANGE_OPTIONS_YOUNG = "Young";
    private static final String AGE_RANGE_OPTIONS_MIDDLE_AGE = "Middle-age";
    private static final String AGE_RANGE_OPTIONS_OLD = "Old";
    private static final String[] AGE_RANGE_OPTIONS = {AGE_RANGE_OPTIONS_YOUNG, AGE_RANGE_OPTIONS_MIDDLE_AGE, AGE_RANGE_OPTIONS_OLD };
    private static final String GENDER_OPTIONS_NON_BINARY = "Non-binary";
    private static final String GENDER_OPTIONS_FEMALE = "Female";
    private static final String GENDER_OPTIONS_MALE = "Male";
    private static final String[] GENDER_OPTIONS = {GENDER_OPTIONS_NON_BINARY, GENDER_OPTIONS_FEMALE, GENDER_OPTIONS_MALE };
    private String[] raceOptions = {};
    private String[] raceSubTypeOptions = {};

    //Instance variables
    private Menu menu;

    //constructor for DnDCLI
    public DnDCLI(Menu menu) {
        this.menu = menu;
    }

    public void run() {
        //While loop that will keep CLI going until the user is done.
        while(true) {
            //Create objects needed in CLI
            Character newCharacter = new Character();
            Race race = new Race();
            Klass klass = new Klass();
            Background background = new Background();
            BackstoryGenerator backstoryGenerator = new BackstoryGenerator(newCharacter);

            //display main menu
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

            //Takes user to backstory generator menu and continues looping until backstory is made.
            if(choice.equals(MAIN_MENU_OPTION_CREATE_NEW_CHARACTER)) {
                boolean isBackstory = true;
                while (isBackstory) {
                    String backstoryChoice = (String) menu.getChoiceFromOptions(BACKSTORY_GENERATOR_MENU);

                    if(backstoryChoice.equals(BACKSTORY_GENERATOR_MENU_RANDOM_BACKSTORY)) {
                        //Feature in progress
                        backstoryGenerator.createBackstory();
                        isBackstory = false;
                    }

                    if(backstoryChoice.equals(BACKSTORY_GENERATOR_MENU_CHOOSE_NAME)) {
                        System.out.print("Please enter your character's name: ");
                        String name = menu.getUserInput();
                        newCharacter.setName(name);
                    }

                    if(backstoryChoice.equals(BACKSTORY_GENERATOR_MENU_CHOOSE_AGE)) {
                        String ageRangeChoice = (String) menu.getChoiceFromOptions(AGE_RANGE_OPTIONS);
                        newCharacter.setAgeRange(ageRangeChoice);
                    }

                    if(backstoryChoice.equals(BACKSTORY_GENERATOR_MENU_CHOOSE_GENDER)) {
                        String genderChoice = (String) menu.getChoiceFromOptions(GENDER_OPTIONS);
                        newCharacter.setGender(genderChoice);
                    }

                    if (backstoryChoice.equals(BACKSTORY_GENERATOR_MENU_CHOOSE_RACE)) {
                        raceOptions = race.getRaceArray();
                        String raceChoice = (String) menu.getChoiceFromOptions(raceOptions);
                        race.setRace(newCharacter, raceChoice);
                        raceSubTypeOptions = newCharacter.getRace().getSubTypeArray();
                        if (raceSubTypeOptions.length > 0) {
                            String subTypeChoice = (String) menu.getChoiceFromOptions(raceSubTypeOptions);
                            newCharacter.setRaceSubType(subTypeChoice);
                        }                                                                                           
                    }

                    if(backstoryChoice.equals(BACKSTORY_GENERATOR_MENU_CHOOSE_CLASS)) {
                        //Feature in progress
                    }

                    if(backstoryChoice.equals(BACKSTORY_GENERATOR_MENU_CHOOSE_BACKGROUND)){
                        //Feature in progress
                    }

                    if(backstoryChoice.equals(BACKSTORY_GENERATOR_MENU_CREATE_BACKSTORY)) {
                        //Feature in progress
//                        backstoryGenerator.createBackstory();
                        System.out.println(backstoryGenerator.createBackstory());
                        isBackstory = false;
                        }
                    }
                }

            //Takes user to character generator menu and continues looping until character sheet it made.
            if(choice.equals(MAIN_MENU_OPTION_GENERATE_SHEET)){
                boolean isCreateSheet = true;
                while(isCreateSheet) {
                    //Until this feature is built this is set to just return to main menu
                    isCreateSheet = false;
                }
            }

            //Exits the program
            if(choice.equals(MAIN_MENU_OPTION_EXIT)){
                System.exit(0);
            }
        }
    }


    //main method goes her, it initializes menu, sending it an input/output, creates a new DnDCLI, then calls the run method
    public static void main(String[] args) {
        Menu menu = new Menu(System.in, System.out);
        DnDCLI cli = new DnDCLI(menu);
        cli.run();
    }

}
