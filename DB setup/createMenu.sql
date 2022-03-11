-- Table: default_schema.menu

-- DROP TABLE IF EXISTS default_schema.menu;

CREATE TABLE IF NOT EXISTS default_schema.menu
(
    id integer NOT NULL DEFAULT nextval('default_schema.menu_id_seq'::regclass),
    name text COLLATE pg_catalog."default" NOT NULL,
    "time" text COLLATE pg_catalog."default",
    CONSTRAINT menu_pkey PRIMARY KEY (id),
    CONSTRAINT menu_name_key UNIQUE (name)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS default_schema.menu
    OWNER to postgres;