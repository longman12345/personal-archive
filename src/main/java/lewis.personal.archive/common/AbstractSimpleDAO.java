package lewis.personal.archive.common;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by LPF on 2016/10/22.
 */
public abstract class AbstractSimpleDAO {
    @Autowired
    @Qualifier("sqlSessionFactory")
    SqlSessionFactory  sqlSessionFactory;

    protected SqlSession getSession() {
        return sqlSessionFactory.openSession(ExecutorType.SIMPLE, true);
    }
}
