import { ConnectionPool, config } from 'mssql'

const config: config = {
   server: 'localhost',
   database: 'BDSidtefim-Test',
   user: 'sa',
   password: '123',
   options: {
      trustedConnection: true,
      instanceName: 'SQLEXPRESS'
   },
   port: 1433
}


export default async function pool(): Promise<ConnectionPool> {
   try {
      const pool: ConnectionPool = new ConnectionPool(config)
      return await pool.connect()
   } catch (err) {
      throw Error(err)
   }
}