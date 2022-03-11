-- Table: default_schema.dishes

-- DROP TABLE IF EXISTS default_schema.dishes;

CREATE TABLE IF NOT EXISTS default_schema.dishes
(
    id integer NOT NULL DEFAULT nextval('default_schema.items_id_seq'::regclass),
    name text COLLATE pg_catalog."default" NOT NULL,
    cuisine text COLLATE pg_catalog."default" NOT NULL,
    portion text COLLATE pg_catalog."default" NOT NULL,
    about text COLLATE pg_catalog."default",
    value integer NOT NULL,
    menu integer NOT NULL,
    CONSTRAINT items_pkey PRIMARY KEY (id),
    CONSTRAINT menu FOREIGN KEY (menu)
        REFERENCES default_schema.menu (id) MATCH FULL
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS default_schema.dishes
    OWNER to postgres;
-- Index: fki_menu

-- DROP INDEX IF EXISTS default_schema.fki_menu;

CREATE INDEX IF NOT EXISTS fki_menu
    ON default_schema.dishes USING btree
    (menu ASC NULLS LAST)
    TABLESPACE pg_default;