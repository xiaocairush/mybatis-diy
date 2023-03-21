package mybatis.diy.datasource.pooled;

import mybatis.diy.datasource.unpooled.UnpooledDataSourceFactory;

import javax.sql.DataSource;

public class PooledDataSourceFactory extends UnpooledDataSourceFactory {

    public PooledDataSourceFactory() {
        this.dataSource = new PooledDataSource();
    }

}
