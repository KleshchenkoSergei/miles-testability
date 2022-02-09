public class BonusMilesService {
    public int calculate(int cost) {
        int mileCost = 20;
        int bonus = cost / mileCost;
        return bonus;
    }

}
