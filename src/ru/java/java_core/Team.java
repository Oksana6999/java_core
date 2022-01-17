package ru.java.java_core;

public class Team {
    private Sportsmen[] members;
    private final String nameTeam;

    public Team(String nameTeam, Sportsmen... members) {
        this.members = members;
        this.nameTeam = nameTeam;
    }

    public void showResults() {
        printDivider();
        System.out.println("В соревновании участвовала команда: " + nameTeam);
        for (Sportsmen member: members) {
            if (member.getStatus() == Status.NoPassedDistance) {
                showResultMemberNoPassed(member);
            }
            else {
                showResultMemberPassed(member);
            }
        }
        printDivider();
    }

    private void showResultMemberNoPassed(Sportsmen member) {
        printDivider();
        System.out.println(member.getNameSportsmen() + " не прошел полосу препятствий");
    }

    private void showResultMemberPassed(Sportsmen member) {
        printDivider();
        System.out.println(member.getNameSportsmen() + " успешно прошел полосу препятствий");
    }

    public Sportsmen[] getMembers() {
        return members;
    }

    private void printDivider() {
        System.out.println("-----------------------------------------------------------");
    }
}
