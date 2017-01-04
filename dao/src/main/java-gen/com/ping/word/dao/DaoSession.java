package com.ping.word.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.ping.word.bean.Word;
import com.ping.word.bean.NewWord;
import com.ping.word.bean.Challenge;

import com.ping.word.dao.WordDao;
import com.ping.word.dao.NewWordDao;
import com.ping.word.dao.ChallengeDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig wordDaoConfig;
    private final DaoConfig newWordDaoConfig;
    private final DaoConfig challengeDaoConfig;

    private final WordDao wordDao;
    private final NewWordDao newWordDao;
    private final ChallengeDao challengeDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        wordDaoConfig = daoConfigMap.get(WordDao.class).clone();
        wordDaoConfig.initIdentityScope(type);

        newWordDaoConfig = daoConfigMap.get(NewWordDao.class).clone();
        newWordDaoConfig.initIdentityScope(type);

        challengeDaoConfig = daoConfigMap.get(ChallengeDao.class).clone();
        challengeDaoConfig.initIdentityScope(type);

        wordDao = new WordDao(wordDaoConfig, this);
        newWordDao = new NewWordDao(newWordDaoConfig, this);
        challengeDao = new ChallengeDao(challengeDaoConfig, this);

        registerDao(Word.class, wordDao);
        registerDao(NewWord.class, newWordDao);
        registerDao(Challenge.class, challengeDao);
    }
    
    public void clear() {
        wordDaoConfig.getIdentityScope().clear();
        newWordDaoConfig.getIdentityScope().clear();
        challengeDaoConfig.getIdentityScope().clear();
    }

    public WordDao getWordDao() {
        return wordDao;
    }

    public NewWordDao getNewWordDao() {
        return newWordDao;
    }

    public ChallengeDao getChallengeDao() {
        return challengeDao;
    }

}
