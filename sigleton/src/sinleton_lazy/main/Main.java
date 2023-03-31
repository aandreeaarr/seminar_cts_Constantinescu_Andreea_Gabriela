package sinleton_lazy.main;

import sinleton_lazy.clase.Agentie;

public class Main {
    public static void main(String[] args) {

        Agentie agentie1 = Agentie.getInstance("Agentie", 100,10);
        Agentie agentie2 = Agentie.getInstance("alta", 58,9);

        System.out.println(agentie1.getNumeAgentie());
        System.out.println(agentie2.getNumeAgentie());

    }
}