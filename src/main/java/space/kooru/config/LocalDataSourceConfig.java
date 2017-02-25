package space.kooru.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by kooru on 2017. 2. 20..
 */
@Configuration
@MapperScan(value="space.kooru.dao", sqlSessionFactoryRef="localSqlSessionFactory")
@EnableTransactionManagement
public class LocalDataSourceConfig {
    @Bean(name = "localDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.local.datasource")
    public DataSource localDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "localSqlSessionFactory")
    @Primary
    public SqlSessionFactory localSqlSessionFactory(DataSource localDataSource, ApplicationContext applicationContext) throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(localDataSource);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mapper/local.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "localSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate localSqlSessionTemplate(SqlSessionFactory localSqlSessionFactory) throws Exception{
        return new SqlSessionTemplate(localSqlSessionFactory);
    }
}
