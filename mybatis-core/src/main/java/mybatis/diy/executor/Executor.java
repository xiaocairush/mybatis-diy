package mybatis.diy.executor;

import mybatis.diy.mapping.BoundSql;
import mybatis.diy.mapping.MappedStatement;
import mybatis.diy.session.ResultHandler;
import mybatis.diy.transaction.Transaction;

import java.sql.SQLException;
import java.util.List;

public interface Executor {

    ResultHandler NO_RESULT_HANDLER = null;

    <E> List<E> query(MappedStatement ms, Object parameter, ResultHandler resultHandler, BoundSql boundSql);

    Transaction getTransaction();

    void commit(boolean required) throws SQLException;

    void rollback(boolean required) throws SQLException;

    void close(boolean forceRollback);

}
