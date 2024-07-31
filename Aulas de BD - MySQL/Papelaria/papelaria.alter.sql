USE PAPELARIA;

ALTER TABLE CLIENTE ADD TELEFONE DECIMAL(11);

UPDATE CLIENTE SET TELEFONE = 123456788962 WHERE CPF = 45678901234;
UPDATE CLIENTE SET TELEFONE = 12345678902 WHERE NOME LIKE '%Ana%';

ALTER TABLE CLIENTE DROP COLUMN TELEFONE;
ALTER TABLE CLIENTE DROP COLUMN TELEFONE; -- Não pode ser apagada, dependencia de FK

DELETE FROM CLIENTE WHERE CPF = 45678901234;

-- < 6.00

DELETE FROM PRODUTO WHERE CNPJ ='23456789000123' AND PRECO < 6.00;

-- LAPIS,CANETA, BORRACHAS - 10%
UPDATE PRODUTO SET PRECO = PRECO * 0.9 	
	WHERE NOMEPRODUTO LIKE '%LAPIS%' 
		OR NOMEPRODUTO LIKE '%CANETA%' 
		OR NOMEPRODUTO LIKE '%BORRACHA%';