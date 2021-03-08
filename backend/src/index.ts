process.env.NODE_ENV = 'dev'

import dotenv = require('dotenv')

console.log(process.env.NODE_ENV)


dotenv.config({ path: `${__dirname}/config/${process.env.NODE_ENV}.env` })

import Server from './models/server'

/*» Initialize  server...  */
const server = new Server()
server.init()