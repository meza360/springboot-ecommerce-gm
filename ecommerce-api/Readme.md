## Github

https://github.com/meza360/springboot-ecommerce-gm

### Repository


In charge of giving us an instance of the objects (models)

### Service

Manages the Jpa operations

### Credenciales locales

### Montaje de MySQL

```bash
docker run --name mysql-ecommerce-spring `
--mount type=volume,source=vmysql-ecommerce,target=/var/lib/mysql `
-p 3306:3306 `
-e MYSQL_ROOT_PASSWORD="18k#$SKA_sO" `
-e MYSQL_DATABASE="ecommerce_db" `
-e MYSQL_USER="ecommerce-user" `
-e MYSQL_PASSWORD="alj!0AKQ" `
-d mysql:8.4-oraclelinux9
```
