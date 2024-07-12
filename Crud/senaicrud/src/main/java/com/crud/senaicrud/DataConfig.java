package com.crud.senaicrud;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataConfig {
    //configuração do banco de dados
    @Bean
    public DataSource dataSource(){
        
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        
        //driver de acesso
        //indica qual o banco vai ser utilizado
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        
        //indicação do endereço (url)
        dataSource.setUrl("jdbc:mysql://localhost:3306/db_crudsenai");

        //setar nome do usuario e senha 
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }


    //configurar interação com o banco, como vai ocorrer
    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        
        //Hibernate: framework de mapeamento objeto relacional
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(true);
        //indica a plataforma do banco
        adapter.setDatabasePlatform("org.hibernate.dialect.MYSQL8Dialect");
        //preparar e estabelecer conexão
        adapter.setPrepareConnection(true);
        return adapter;

    };


}
