import { Router, Request, Response } from 'express'
import { testController } from '../controllers/test.controller'

const router = Router()


router.post('/save', testController)


export default router

