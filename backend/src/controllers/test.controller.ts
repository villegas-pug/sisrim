import { Request as Req, Response as Res } from 'express'
import { Request, ConnectionPool } from 'mssql'

import pool from '../db'

export const testController = async (req: Req, res: Res): Promise<Res> => {
   const conn: ConnectionPool = await pool()
   try {
      const sql: Request = new Request(conn)
      const { recordset } = await sql.query('SELECT * FROM SidPais')
      return res.json(recordset)
   } catch (err) {
      return res.status(500).json({
         error: err
      })
   } finally {
      conn.close()
   }
}