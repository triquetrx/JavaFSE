CREATE OR REPLACE PROCEDURE insert_credit
(credit_id in number,
credit_card_number in varchar2,
credit_card_expire in varchar2,
holder_name in varchar2,
card_type in varchar2
)
as
BEGIN
    insert into credit_card(id,card_number,card_expire,name,cc_type)
    values(credit_id,credit_card_number,credit_card_expire,holder_name,card_type);
    commit;
END;
/