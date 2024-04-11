insert into users (username, password, enabled)
values ('admin', '{bcrypt}$2a$10$VRNgE.XF61q.2E3FcYgffuJOoNt2A.tKUWb.YBKhDx2/b78tak8MS', true);

insert into authorities (username, authority)
values ('admin', 'ROLE_ADMIN');