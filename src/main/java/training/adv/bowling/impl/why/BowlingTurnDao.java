package training.adv.bowling.impl.why;


import training.adv.bowling.api.BowlingTurn;
import training.adv.bowling.api.BowlingTurnEntity;
import training.adv.bowling.api.TurnKey;
import training.adv.bowling.impl.AbstractBatchDao;

import java.util.List;

public class BowlingTurnDao extends AbstractBatchDao {

    @Override
    protected List<TurnKey> loadAllKey(int foreignId) {
        return null;
    }

    @Override
    protected void doSave(BowlingTurnEntity entity) {

    }

    @Override
    protected BowlingTurnEntity doLoad(TurnKey id) {
        return null;
    }

    @Override
    protected BowlingTurn doBuildDomain(BowlingTurnEntity entity) {
        return null;
    }

    @Override
    public boolean remove(TurnKey key) {
        return false;
    }
}
