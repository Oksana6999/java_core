package ru.java.TeamChallenge;

public class Sportsmen {
    private Status status = Status.NoPassedDistance;
    private String nameSportsmen;
    private int power;

    public Sportsmen (String nameSportsmen, int power) {
        this.nameSportsmen = nameSportsmen;
        this.power = power;
    }

    public Status getStatus() {
        return status;
    }

    public String getNameSportsmen() {
        return nameSportsmen;
    }

    public void fight(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," победил в бою");
        }
        else{
            changeStatus(Status.NoPassedDistance," проиграл в бою");
        }
    }

    public void jump(int courseDifficulty){
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," преодолел барьер");
        }
        else{
            changeStatus(Status.NoPassedDistance," не преодолел барьер");
        }
    }

    public void run(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," пробежал кросс");
        }
        else{
            changeStatus(Status.NoPassedDistance,"  не пробежал кросс");
        }
    }

    public void swimm(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," проплыл дистанцию");
        }
        else{
            changeStatus(Status.NoPassedDistance," не проплыл дистанцию");
        }
    }

    private boolean checkPower(int courseDifficulty) {
        return power > courseDifficulty || power == courseDifficulty;
    }

    private void changeStatus(Status newStatus, String message) {
        status = newStatus;
        System.out.println(nameSportsmen + message);
    }
}
