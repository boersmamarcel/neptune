<<<<<<< HEAD
PUSH 6
LOADL 79
LOADL 76
LOADL 76
LOADL 69
LOADL 72
STORE(1) 0[LB]
STORE(1) 1[LB]
STORE(1) 2[LB]
STORE(1) 3[LB]
STORE(1) 4[LB]
LOADL 0
L0: 
LOAD(1) -1[ST]
LOADA 0[LB]
CALL add
LOADI(1)
STORE(1) 5[LB]
LOAD(1) 5[LB]
CALL put
CALL succ
LOAD(1) -1[ST]
JUMPIF(5) L1[CB]
JUMP L0[CB]
L1: 
POP(0) 1
LOADL 46
CALL put
POP(0) 6
HALT
valid0: LOAD(1) -2[LB]
LOAD(1) -1[LB]
CALL ge
JUMPIF(0) valid1[CB]
LOADL 83
LOADL 68
LOADL 78
LOADL 85
LOADL 79
LOADL 66
LOADL 32
LOADL 70
LOADL 79
LOADL 32
LOADL 84
LOADL 85
LOADL 79
CALL put
CALL put
CALL put
CALL put
CALL put
CALL put
CALL put
CALL put
CALL put
CALL put
CALL put
CALL put
CALL put
HALT
valid1: RETURN(0) 2
=======
>>>>>>> FETCH_HEAD
