package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class DefenceNumber {

    public List<Integer> defenceNumber;

    DefenceNumber(int size) {
        defenceNumber = new ArrayList<>();
        createDefenceNumber(size);
    }

    private void createDefenceNumber(int size) {
        while(defenceNumber.size() < size) {
            int random = Randoms.pickNumberInRange(1, 9);
            checkOverlapAndAdd(random);
        }
    }

    private void checkOverlapAndAdd(int target) {
        if(!defenceNumber.contains(target)) {
            defenceNumber.add(target);
        }
    }

    public List<Integer> getDefenceNumber() {
        return defenceNumber;
    }
}
