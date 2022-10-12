
from vpython import *

ball = sphere(pos=vector(2,6,0), radius=0.5, color=color.cyan)
ball.trail = curve(color=ball.color)

wallR = box(pos=vector(11,8,0), size=vector(0.2,12,12), color=color.green)
wallL = box(pos=vector(2,8,0),  size=vector(0.2,12,12), color=color.green)
# axis= vector(1,1,1),
ball.velocity = vector(25,5,0)

vscale = 0.1
varr = arrow(pos = vector(ball.pos), axis=vscale*ball.velocity, color=color.yellow)

deltat = 0.005
t = 0

while t < 10:

    rate(100)

    # if ball.pos.x > wallR.pos.x:
    #     ball.velocity.x = -ball.velocity.x

    # elif ball.pos.x < wallR.pos.x:
    #     ball.velocity.x = +ball.velocity.x

    # elif ball.pos.y > wallL.pos.y:
    #     ball.velocity.y = -ball.velocity.y

    # elif ball.pos.y < wallL.pos.y:
    #     ball.velocity.y = +ball.velocity.y

    if ball.pos.x > wallR.pos.x:
        ball.velocity.x = -ball.velocity.x

    elif ball.pos.x < wallL.pos.x:
        ball.velocity.x = -ball.velocity.x

    # elif ball.pos.y > wallL.pos.y:
    #     ball.velocity.y = -ball.velocity.y

    # elif ball.pos.y < wallL.pos.y:
    #     ball.velocity.y = +ball.velocity.y

    ball.pos = ball.pos + ball.velocity*deltat
    ball.trail.append(pos=vector(ball.pos))

    # vscale = 0.1
    # varr = arrow(pos=vector(ball.pos), axis=vscale*ball.velocity, color=color.yellow)
    t = t + deltat



# ball = sphere(pos=vector(0,10,0), radius=1, color=color.red, make_trail=True)
# floor = box(pos=vector(0,0,0), size = (10,0.5,10), color=color.green, make_trail=True)
# ball.velocity=vector(0,0,0)
# dt=0.01
# t=0
# g=-9.8

# while (t < 20):
#     rate(100)
#     ball.velocity.y=ball.velocity.y+g*dt
#     ball.pos=ball.pos+ball.velocity*dt
    
#     if (ball.pos.y < floor.pos.y + 1.25) :
#         ball.velocity.y = -ball.velocity.y
        
#     t=t+dt