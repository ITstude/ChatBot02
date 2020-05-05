package com.company;




public class Text {

    public String humanText(String getText){
        return "Me: " + getText + "\n";
    }
    public String botText(String getText){
        if (getText.contains("hej")){
            return "Bot: " + botHey() + "\n";}
        if (getText.contains("how are you")){
            return "Bot: " + botFelling() + "\n";
        }

        return "Bot: Bleh "+ "\n";
    }
    private String botHey() {
        double random = Math.random();
        if (random > 0.5) {
            return "Hey";
        } else {
            return "Good Morining";
        }
    }
    private String botFelling(){
        double  random = Math.random();
        if(random < 0.3)
            return "I'm fine, Thanks";
        if(random >= 0.3 & random < 0.6)
            return "I'm bored";
        else
            return "I'm happy because You talk with me";
    }
}

