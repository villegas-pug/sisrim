process.env.NODE_ENV = process.env.NODE_ENV || 'prod'

import Server from './models/server'
import dotenv = require('dotenv')

dotenv.config({ path: `${__dirname}/config/${process.env.NODE_ENV}.env` })

/*» Initialize  server...  */
const server = new Server()
server.init()