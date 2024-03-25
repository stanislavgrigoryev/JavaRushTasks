alter table event
    add foreign key (user_id)
        references users (id)
        ON UPDATE CASCADE
        ON DELETE SET NULL;
