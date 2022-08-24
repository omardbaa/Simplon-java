/*Create Table Questions:*/
CREATE TABLE IF NOT EXISTS public.questions
(
id serial NOT NULL,
question char(255) NOT NULL,
option1 char(255) NOT NULL,
option2 char(255) NOT NULL,
option3 char(255) NOT NULL,
option4 char(255) NOT NULL,
answer char(1) NOT NULL,
CONSTRAINT "questions_pkey" PRIMARY KEY (id, question),
UNIQUE (id),
UNIQUE (question)
);



SELECT * FROM questions