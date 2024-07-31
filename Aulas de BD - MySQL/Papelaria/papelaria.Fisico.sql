CREATE DATABASE IF NOT EXISTS PAPELARIA;

USE PAPELARIA; 

CREATE TABLE FORNECEDOR(
	CNPJ DECIMAL(14) NOT NULL,
    NOME VARCHAR(100) NOT NULL,
    EMAIL VARCHAR(100) NOT NULL,
    TELEFONE DECIMAL(11) NOT NULL,
    ENDERECO VARCHAR(100) NOT NULL,
    
    CONSTRAINT FORNECEDOR_PK PRIMARY KEY(CNPJ)
)ENGINE =INNODB;


CREATE TABLE PRODUTO(
	CODIGO INT NOT NULL AUTO_INCREMENT,
    CNPJ DECIMAL(14) NOT NULL,
    PRECO DOUBLE(3,2) NOT NULL,
    NOME VARCHAR(50) NOT NULL,
    DESCRICAO VARCHAR(150) NOT NULL,
    VALIDADE DATE,
    
    CONSTRAINT PRODUTO_PK PRIMARY KEY(CODIGO),
    
    CONSTRAINT FORNECEDOR_CPNJ_FK FOREIGN KEY(CNPJ)
		REFERENCES FORNECEDOR(CNPJ)
			ON DELETE CASCADE  
)ENGINE =INNODB;


CREATE TABLE CLIENTE(
	CPF DECIMAL(11) NOT NULL,
    NOME VARCHAR(100) NOT NULL,
    EMAIL VARCHAR(100) NOT NULL,
    ENDERECO VARCHAR(100),
    
    CONSTRAINT CLIENTE_PK PRIMARY KEY(CPF)

)ENGINE=INNODB;


CREATE TABLE FUNCIONARIO(
	MATRICULA INT NOT NULL AUTO_INCREMENT,
    NOME VARCHAR(100) NOT NULL,
    FUNCAO VARCHAR(30) NOT NULL,
     EMAIL VARCHAR(100) NOT NULL,
     
     CONSTRAINT FUNCIONARIO_PK PRIMARY KEY(MATRICULA)
)ENGINE=INNODB;


CREATE TABLE VENDA(
	IDVENDA INT NOT NULL AUTO_INCREMENT,
    MATRICULA INT NOT NULL,
    CPF DECIMAL(11) NOT NULL,
    
    CONSTRAINT VENDA_PK PRIMARY KEY(IDVENDA),
    
    CONSTRAINT MATRICULA_FUNCIONARIO_FK FOREIGN KEY(MATRICULA)
		REFERENCES FUNCIONARIO(MATRICULA)
			ON DELETE CASCADE,   
	CONSTRAINT CPF_CLIENTE_FK FOREIGN KEY(CPF)
		REFERENCES CLIENTE(CPF)
			ON DELETE CASCADE
            
)ENGINE=INNODB;


CREATE TABLE LISTAPRODUTOS(
	
)ENGINE=INNODB;

