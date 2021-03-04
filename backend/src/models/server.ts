import express, { Application, json } from 'express'
import cors from 'cors'
import routes from '../routes/test.routes'

export default class Server {

   private app: Application

   constructor() {
      /*» Config server...  */
      this.app = express()
      this.settings()

      /*» Init route's  */
      this.routes()
   }

   /*» Handle setting's  */
   private settings(): void {
      this.app.set('port', process.env.PORT)
      this.app.use(json())
      this.app.use(cors())
   }

   /*» Handle middleware route's  */
   private routes(): void {
      this.app.use(routes)
   }


   /*» ...  */
   public init(): void {
      this.app.listen(this.app.get('port'), () => {
         console.log(`Servidor en puerto: ${this.app.get('port')}`)
      })
   }
}